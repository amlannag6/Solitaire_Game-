import java.util.*;
/**
 *
 * @author John
 */
public class Deck {
  
  private Stack<Card> stack;
  public  Deck(){
    this.stack = new Stack<Card>();
    init();
  }
  public void shuffle(){
    ArrayList<Card> cards = new ArrayList<Card>(stack);
    Collections.shuffle(cards);
    stack.clear();
    for(Card c: cards){
      stack.push(c);
    }
  }
    private void init(){
    for(int i=2; i<14; i++){
      stack.push(new Card("Diamond", i));
      stack.push(new Card("Heart", i));
      stack.push(new Card("Spade", i));
      stack.push(new Card("Flower", i));
    }
    shuffle();
  }
    public Card pick(){
    return stack.pop();
  }
    public String desc(){
    return "Deck/Stock containing "+stack.size()+" cards";
  }  
}