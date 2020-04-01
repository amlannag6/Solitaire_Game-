//COMP 2230_02
//Data Structure, Algorithm Analysis, and Program Design
//Johnny Cuzzola
// Feb 16 th 2020
// Assignment : Midterm 1
// Name : Amlan Nag ( T00605732)

public class Card {
  private  String suit, color;
  private  int rank;
   public Card(String suit, int rank){
    this.suit = suit;
    this.rank = rank;
    if (suit.equals("Diamond") || suit.equals("Heart")){
      this.color = "red";
    }else{
      this.color = "black";
    }
  }
  
  public void setColor(String color) {
    this.color = color.toLowerCase();
  }
  
  public String getColor() {
    return color;
  }
  
  public String getSuit() {
    return suit;
  }
  
  public int getRank() {
    return rank;
  }
  
  public void setSuit(String suit) {
    this.suit = suit;
  }
  
  public void setRank(int rank) {
    this.rank = rank;
  }
  
  
  
  @Override
  public String toString() {
    return rank+String.valueOf(suit.charAt(0));
  }
  
  public  boolean opositColor(Card card){
    try {
      return !this.color.equals(card.getColor());
    }catch (NullPointerException ex){
      return false;
    }
    
  }
}
