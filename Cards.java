package cardgame;

// Cards - Maintains a collection of zero or more playing cards.
//         Provides facilities to create a full pack of 52 cards
//         and to shuffle the cards.
// author: Halil Alperen Gözeten
// date: 20/02/2021
public class Cards
{
    // Constants
    final int NOOFCARDSINFULLPACK = 52;
    
    // properties
    Card[] cards;
    int    valid;  // number of cards currently in collection
    
    // constructors
    /**
     * This constructor takes a boolean, fullPack, and creates a full pack of cards if it's true. Empty set of cards if it's false
     * @param fullPack
     */
    public Cards( boolean fullPack)
    {
        cards = new Card[ NOOFCARDSINFULLPACK ];
        valid = 0;
        
        if ( fullPack)
            createFullPackOfCards();
    }
    
    // methods

    /**
     * This method removes and returns the top card from the cards array.
     * @return Card
     */
    public Card getTopCard()
    {
        Card tmp;

        if ( valid <= 0)
            return null;
        else
        {
            valid--;
            tmp = cards[valid];
            cards[valid] = null;
            return tmp;
        }
    }
    
    /**
     * This method takes a Card instance and adds it to the cards array if there are still some space in it. If it's succesful adding
     * it, it returns true. False, otherwise.
     * @param c is an instance of Card class.
     * @return boolean
     */
    public boolean addTopCard( Card c)
    {
        if ( valid < cards.length)
        {
            cards[valid] = c;   // should this be cloned?
            valid++;
            return true;
        }
        return false;
    }
    
    /**
     * This method is called from the constructor. It initializes the cards array to full pack of cards.
     */
    private void createFullPackOfCards()
    {
        // Todo

        // Using a for-loop, add all the Card instances to cards.
        for ( int i = 0; i < NOOFCARDSINFULLPACK; i ++) {
            addTopCard( new Card(i));
        }
    }
    
    /**
     * This method shuffles cards array.
     */
    public void shuffle()
    {
        // We will start from the last element and swap the cards one by one. We actually
        // don't need to swap the last element.
        for (int i = valid - 1; i > 0; i --) { 
              
            // By using Math.random, we will get a random integer from 0 to i
            int j = (int) ( (i+1) * Math.random()); 
              
            // Swapping with the help of temp instance of Card Class.
            Card temp = cards[i]; 
            cards[i] = cards[j]; 
            cards[j] = temp; 
        } 
        // Prints the random array 
    }
    
    
    // For testOnly... remove from production version!
    public void testOnlyPrint()
    {
        for ( int i =0; i < valid; i++)
        {
            System.out.println( cards[i] );
        }
    }
    
} // end class Cards
