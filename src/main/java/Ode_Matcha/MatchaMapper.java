package Ode_Matcha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Ode_Matcha.Diary_Items.DiaryEntry;

public class MatchaMapper {
  public static DiaryEntry rowToMatcha(List<Object> row) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return new DiaryEntry(
      LocalDate.parse(row.get(0).toString(), formatter),
      row.get(1).toString(),
      Integer.parseInt(row.get(2).toString()),
      Integer.parseInt(row.get(3).toString()),
      Integer.parseInt(row.get(4).toString()),
      row.get(5).toString(),
      Integer.parseInt(row.get(6).toString()),
      row.get(7).toString(),
      Boolean.parseBoolean(row.get(8).toString()),
      Integer.parseInt(row.get(9).toString()),
      row.get(10).toString(),
      Integer.parseInt(row.get(11).toString()),
      Integer.parseInt(row.get(12).toString()),
      Boolean.parseBoolean(row.get(13).toString()),
      row.get(14).toString(),
      row.get(15).toString());
  }

  public static List<DiaryEntry> rowsToMatcha(List<List<Object>> rows) {
    List<DiaryEntry> diaryList = new ArrayList<>();
    rows.remove(0);
    rows.remove(0);
    for (List<Object> row : rows) {
      diaryList.add(rowToMatcha(row));
    }
    return diaryList;
  }

  public static List<Object> matchaToRow(DiaryEntry diary) {
    List<Object> row = new ArrayList<>();
    row.add(diary.getDate());
    row.add(diary.getMatchaType());
    row.add(diary.getMatchaAmount());
    row.add(diary.getWaterAmount());
    row.add(diary.getMilkAmount());
    row.add(diary.getMilkType());
    row.add(diary.getSweetenerAmount());
    row.add(diary.getSweetenerType());
    row.add(diary.getIceUsed());
    row.add(diary.getIceAmount());
    row.add(diary.getColour());
    row.add(diary.getColourRating());
    row.add(diary.getTasteRating());
    row.add(diary.isSeparation());
    row.add(diary.getPhoto());
    row.add(diary.getNotes());
    return row;
  }
  
}