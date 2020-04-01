//COMP 2230_02
//Data Structure, Algorithm Analysis, and Program Design
//Johnny Cuzzola
// Feb 16 th 2020
// Assignment : Midterm 1
// Name : Amlan Nag ( T00605732)

import java.util.Stack;
public class Waste {
  private Stack<Card> stack ;
  
  public Waste(){
    stack = new Stack<Card>();
  }
  
  public  void moveToDeck(Deck deck){
    stack.push(deck.pick());
  }
  
  public void pop(){
    stack.pop();
  }
  
  public Card peek(){
    return stack.peek();
  }
  
  public  String desc(){
    if (stack.isEmpty()){
      return "Top card of waste is showing : (Empty)";
    }
    return "Top card of waste is showing : "+stack.size();
  }
  
  public boolean moveToFoundation(Foundation foundation){
    if (foundation.move(stack.peek())){
      stack.pop();
      return true;
    }
    return false;
  }
  }
