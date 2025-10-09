package Ode_Matcha;

public class SheetsImage {
  private int row;
  private int col;
  private String url;

  public SheetsImage(int row, int col, String url) {
    this.row = row;
    this.col = col;
    this.url = url;
  }

  public int getRow() {
    return this.row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public int getCol() {
    return this.col;
  }

  public void setCol(int col) {
    this.col = col;
  }

  public String getURL() {
    return this.url;
  }

  public void setURL(String url) {
    this.url = url;
  }
}
