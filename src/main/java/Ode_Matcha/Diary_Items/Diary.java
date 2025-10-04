package Ode_Matcha.Diary_Items;

import java.time.LocalDate;

public class Diary {
  private LocalDate date;
  private String matchaType;
  private int matchaAmount;
  private int waterAmount;
  private int milkAmount;
  private String milkType;
  private int sweetenerAmount;
  private String sweetenerType;
  private int iceAmount;
  private String colour;
  private int colourRating;
  private int tasteRating;
  private boolean separation;
  private String photo;
  private String notes;

  public Diary(LocalDate date, String matchaType, int matchaAmount, int waterAmount, int milkAmount, String milkType, int sweetenerAmount, String sweetenerType, int iceAmount, String colour, int colourRating, int tasteRating, boolean separation, String photo, String notes) {
    setDate(date);
    setMatchaType(matchaType);
    setMatchaAmount(matchaAmount);
    setWaterAmount(waterAmount);
    setMilkAmount(milkAmount);
    setMilkType(milkType);
    setSweetenerAmount(sweetenerAmount);
    setSweetenerType(sweetenerType);
    setIceAmount(iceAmount);
    setColour(colour);
    setColourRating(colourRating);
    setTasteRating(tasteRating);
    setSeparation(separation);
    setPhoto(photo);
    setNotes(notes);
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getMatchaType() {
    return matchaType;
  }

  public void setMatchaType(String matchaType) {
    this.matchaType = matchaType;
  }

  public int getMatchaAmount() {
    return matchaAmount;
  }

  public void setMatchaAmount(int matchaAmount) {
    this.matchaAmount = matchaAmount;
  }

  public int getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(int waterAmount) {
    this.waterAmount = waterAmount;
  }

  public int getMilkAmount() {
    return milkAmount;
  }

  public void setMilkAmount(int milkAmount) {
    this.milkAmount = milkAmount;
  }

  public String getMilkType() {
    return milkType;
  }

  public void setMilkType(String milkType) {
    this.milkType = milkType;
  }

  public int getSweetenerAmount() {
    return sweetenerAmount;
  }

  public void setSweetenerAmount(int sweetenerAmount) {
    this.sweetenerAmount = sweetenerAmount;
  }

  public String getSweetenerType() {
    return sweetenerType;
  }

  public void setSweetenerType(String sweetenerType) {
    this.sweetenerType = sweetenerType;
  }

  public int getIceAmount() {
    return iceAmount;
  }

  public void setIceAmount(int iceAmount) {
    this.iceAmount = iceAmount;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public int getColourRating() {
    return colourRating;
  }

  public void setColourRating(int colourRating) {
    this.colourRating = colourRating;
  }

  public int getTasteRating() {
    return tasteRating;
  }

  public void setTasteRating(int tasteRating) {
    this.tasteRating = tasteRating;
  }

  public boolean isSeparation() {
    return separation;
  }

  public void setSeparation(boolean separation) {
    this.separation = separation;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
}
