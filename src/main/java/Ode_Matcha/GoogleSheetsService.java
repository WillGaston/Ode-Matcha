package Ode_Matcha;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;

public class GoogleSheetsService {
  private static final String CREDENTIALS_FILE_PATH = "/credentials.json";
  private static final String APPLICATION_NAME = "Ode-Matcha Logger";
  private static final String SPREADSHEET_ID = "REMOVED";
  private static final String RANGE = "Sheet1!B:R";

  private static Sheets getSheetsService() throws Exception {
    InputStream in = GoogleSheetsService.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
    if (in == null) throw new RuntimeException("⚠ credentials.json not found in resources folder");

    GoogleCredentials credentials = GoogleCredentials.fromStream(in).createScoped(Collections.singleton(SheetsScopes.SPREADSHEETS));

    return new Sheets.Builder(
      GoogleNetHttpTransport.newTrustedTransport(),
      GsonFactory.getDefaultInstance(),
      new HttpCredentialsAdapter(credentials))
      .setApplicationName(APPLICATION_NAME)
      .build();
  }

  // Read all rows
  public static List<List<Object>> readData() throws Exception {
    Sheets service = getSheetsService();
    ValueRange response = service.spreadsheets().values().get(SPREADSHEET_ID, RANGE).execute();
    return response.getValues();
  }

    // Append a new row
  public static void appendRow(List<Object> rowData) throws Exception {
    Sheets service = getSheetsService();
    ValueRange body = new ValueRange().setValues(Collections.singletonList(rowData));
    service.spreadsheets().values().append(SPREADSHEET_ID, RANGE, body).setValueInputOption("RAW").execute();
  }

  public static void main(String[] args) throws Exception {
    List<List<Object>> rows = GoogleSheetsService.readData();
    rows.forEach(row -> System.out.println(row));
  }
}
