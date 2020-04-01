//COMP 2230_02
//Data Structure, Algorithm Analysis, and Program Design
//Johnny Cuzzola
// Feb 16 th 2020
// Assignment : Midterm 1
// Name : Amlan Nag ( T00605732)

import java.util.Stack;
public class Foundation {
  private Stack<Card> hearts,diamonds, spades,flowers;
  public Foundation(){
    this.diamonds = new Stack<Card>();
    this.hearts = new Stack<Card>();
    this.spades = new Stack<Card>();
    this.flowers = new Stack<Card>();
    init();
  }
  
  private void init(){
    diamonds.push(new Card("Diamond", 1));
    hearts.push(new Card("Heart", 1));
    spades.push(new Card("Spade", 1));
    flowers.push(new Card("Flower", 1));
  }
  
  public boolean move(Card card){
    if (card.getSuit().equals("Diamond")){
      if ( diamonds.peek().getRank() - card.getRank() == -1){
        diamonds.push(card);
        return true;
      }
    }else if (card.getSuit().equals("Heart")){
      if (hearts.peek().getRank() - card.getRank() == -1){
        hearts.push(card);
        return true;
      }
    }else if (card.getSuit().equals("Spade")){
      if (spades.peek().getRank() - card.getRank() == -1){
        spades.push(card);
        return true;
      }
      
    }else if (card.getSuit().equals("Flower")){
      if ( flowers.peek().getRank() - card.getRank() == 1){
        flowers.push(card);
        return true;
      }
    }
    return false;
  }
  
  public String desc(){
    return  "<FOUNDATIONS>\n"+diamonds.peek().toString()+"\n"+hearts.peek().toString()+"\n"+spades.peek().toString()+"\n"+flowers.peek().toString()+"\n";
  }
}
