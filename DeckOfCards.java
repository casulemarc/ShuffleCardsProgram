/**
 * A program that will randomly slect cards
 * @author casul
 *
 */
public class DeckOfCards {
	
  public static void main(String[] args) {
	  
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Jack", "Queen", "King"};
        
    // Initialize cards
    for (int i = 0; i < deck.length; i++)
      deck[i] = i; 	//all 52
    
    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int)(Math.random() * deck.length);
      
      //swap cards
      int temp = deck[i];
      deck[i] = deck[index]; 	//let the card at index 0 == the random card drawn
      deck[index] = temp;
    }

    // Display the first four cards
    for (int i = 0; i < 4; i++) {
    	
      String suit = suits[deck[i] / 13];	//(all flowers, spades, diamonds and heart) / 13 == 52 /13 = 4
      String rank = ranks[deck[i] % 13];	//(all aces, 2,3,4,5,6,7,8,9,10,j,k) % 13 
      System.out.println("Card number " + deck[i] + ": " 
        + rank + " of " + suit);
    }
  }
}