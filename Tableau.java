//COMP 2230_02
//Data Structure, Algorithm Analysis, and Program Design
//Johnny Cuzzola
// Feb 16 th 2020
// Assignment : Midterm 1
// Name : Amlan Nag ( T00605732)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tableau {
  private Stack<Card> stack;
  private Queue<Card> queue;
  
  public Tableau(){
    stack = new Stack<Card>();
    queue = new LinkedList<Card>();
  }
  public void move_init(Card card){
    queue.add(card);
  }
  
  public boolean move(Card card){
    if (card.opositColor(queue.peek()) && queue.peek().getRank() - card.getRank() == 1){
      queue.add(card);
      return true;
    }
    return false;
  }
  
  public void turn(){
    this.stack.push(this.queue.remove());
  }
  
  public Card next(){
    return stack.peek();
  }
  
  public  Card remove(){
    return  stack.pop();
  }
  
  public  String  desc(){
    return  "has "+queue.size()+" face down cards and "+stack.size()+" face up cards, showing "+stack.peek().toString();
  }
  
  
}
