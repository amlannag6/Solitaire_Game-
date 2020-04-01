# Solitaire_Game-
     Game terms and design requirements :  

Deck/Stock - A pile of cards, face down, which are left over after setting up the other layout areas. These are turned over one-at-a-time into the waste. 
Waste - The area where the cards from the deck/stock go when they are brought into play. Only cards from the stock can be played to the waste. Only the topmost card can be moved to either the foundation or to the tableau. 
Foundations - The aim of the games is to clear the tableau and move all the cards to the foundation. They are built up by suit from Ace(1) to King(13). Assume at the start of the game, the four ACEs are already placed on the foundation.
Tableaus - This consists of a number of piles where cards can be moved from one tableau to another or from tableau to a foundation. Each tableau (ex. T4 see picture) has both a stack and a queue. The stack holds the cards that have been turned over while the queue holds the cards that have not yet turned. At the start of the game Tableau 0 (T0 see picture) starts with a queue containing 1 card, T1 has two cards, T2 has 3 cards and so on. The game begins by DEQUEUING one card from each of these queues and placing it into the stack of the tableau. Hence, the T0 queue begins the game with 0 cards, T1 queue has 1 card and so forth while each of the tableau stacks have the one card to start with (the topmost card you can see).  
Recommended you use an ARRAY of 7 queues and another ARRAY of 7 stacks for this. 

    Simple Game Rules
    
You can only move the top card of any stack.
To move a card to the foundation, the foundation must have the previous card already there. Example, you can't move 12D if 11D is not already in the foundation.
To move a card onto a tableau, the card must be one less than the card currently showing on the target tableau AND the suit color must be opposite color than the card showing. Example, moving 7H on a tableau currently showing a 8S is allowed but you can't move 7H to a 8D (suit colors are both red). You can also move any card to the tableau if the tableau is empty (no cards in its stack or queue left).


     Instructions for playing the Game :
     
1. CardGame.java is the main class.
2. Including CardGame.java- 6 new Java Class created (To compile the program easily)
3. Deck.java files used for program – Resource: John/ file provided
4. For each functionality, I made 4 different class as JAVA is object Oriented so separate file will be easy to call in any class.
5. Used Exception method so that if player don’t follow the role – program will guide the user.

      References
      
A Case Study: Solitaire. (2017). Retrieved from A Case Study: Solitaire: https://www.it.uu.se/edu/course/homepage/oopjava/vt19/exempeltenta/exempel-090530/budd/solit.pdf
Budd, T. (1996). Simple Solitaire Card Game in Java. Retrieved from Umb.Edu: https://www.cs.umb.edu/~laur/Java/Solitaire/Solitaire.java
Java stacks simple solitaire. (2016). Retrieved from Stackoverflow: https://stackoverflow.com/questions/29024598/java-stacks-simple-solitaire
