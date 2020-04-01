//COMP 2230_02
//Data Structure, Algorithm Analysis, and Program Design
//Johnny Cuzzola
// Feb 16 th 2020
// Assignment : Midterm 1
// Name : Amlan Nag ( T00605732)

public class Tableaus {
  private Tableau[] tableaus;
  
  public Tableaus(Deck deck){
    tableaus = new Tableau[7];
    init(deck);
  }
  
  private void init(Deck deck){
    for (int i=0; i<7; i++){
      tableaus[i] = new Tableau();
    }
    
    for(int i=0; i<tableaus.length; i++){
      for(int j=0; j<i+1; j++){
        tableaus[i].move_init(deck.pick());
      }
      tableaus[i].turn();
    }
  }
  
  public String desc(){
    String desc = "< TABLEAUS >\n";
    for(int i=0; i<tableaus.length; i++){
      desc+="T"+i+": "+tableaus[i].desc()+"\n";
    }
    return desc;
  }
  
  public boolean moveFromWaste(Waste waste){
    for (Tableau tableau: tableaus){
      if(tableau.move(waste.peek())){
        waste.pop();
        return true;
      }
    }
    return false;
  }
  
  public boolean transfer(int s, int d){
    if (tableaus[d].move(tableaus[s].next())){
      tableaus[s].remove();
      return true;
    }
    return  false;
  }
  
  public boolean moveToFoundation(int s, Foundation foundation){
    if (foundation.move(tableaus[s].next())){
      tableaus[s].remove();
      return true;
    }
    return false;
  }
  
}
