//COMP 2230_02
//Data Structure, Algorithm Analysis, and Program Design
//Johnny Cuzzola
// Feb 16 th 2020
// Assignment : Midterm 1
// Name : Amlan Nag ( T00605732)


import java.util.Scanner;
public class CardGame {
  private static Scanner in = new Scanner(System.in);
  public static int showMenu(){
    while (true){
      System.out.println("MENU: \n1. Draw card from the Deck" +
                         "\n2. Move waste card to foundations" +
                         "\n3. Move waste card to tableaus" +
                         "\n4. Move tableau card to another tableau" +
                         "\n5. Move tableau card to foundation" +
                         "\n6. Quit game");
      try {
        int respomse = Integer.parseInt(in.nextLine());
        if (respomse >6 || respomse <1){
          System.out.println("Invalid choice");
        }else {
          return respomse;
        }
      }catch (NumberFormatException e){
        System.out.println("Invalid choice");
      }
    }
  }
  
 public static void main(String[] args) {     // Main Class 
    Deck deck = new Deck();
    Tableaus tableaus = new Tableaus(deck);
    Foundation foundation = new Foundation();
    Waste waste = new Waste();
    while (true){
      System.out.println(deck.desc());
      System.out.println(waste.desc());
      System.out.println(tableaus.desc());
      System.out.println(foundation.desc());
      int choice = showMenu();
      if (choice == 6){
        System.out.println("Thanks For Playing Solitaire Game-BYE !");
        break;
      }else if (choice == 1){
        waste.moveToDeck(deck);
      }else if (choice == 2){
        if (waste.moveToFoundation(foundation)){
          System.out.println("Done!");
        }else {
          System.out.println("No compatible foundation to move the card to.");
        }
      }else if (choice == 3){
        if (tableaus.moveFromWaste(waste)){
          System.out.println("Done!");
        }else {
          System.out.println("No compatible Tableau to take the card.");
        }
      }else if(choice == 4){
        System.out.print("Enter Source tableau :");
        int s = Integer.parseInt(in.nextLine());
        System.out.print("Enter Destination tableau :");
        int d = Integer.parseInt(in.nextLine());
        if (tableaus.transfer(s,d)){
          System.out.println("Done!");
        }else {
          System.out.println("The card can not be moved to the destination tableau.");
        }
        
      }else if (choice == 5){
        System.out.println("From which tableau :");
        int s = Integer.parseInt(in.nextLine());
        if (tableaus.moveToFoundation(s, foundation)){
          System.out.println("Done!");
        }else {
          System.out.println("Can not move the card to foundation");
        }
      }
      
    }
  }
}
// End of Program ! Thanks for your Concern    