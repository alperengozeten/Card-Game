package cardgame;

/**
 * Card - a single playing card
 * @author Halil Alperen Gözeten
 * @version 20/02/2021
 */
public class Card
{
    // constants - to do in lectures
    final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs"};
    final String[] FACES = { "A","2", "3", "4", "5",
                             "6", "7", "8", "9", "10",
                             "J", "Q", "K"};
    
    final int NOOFCARDSINSUIT = 13;
    
    // properties - to do in lectures
    int  cardNo;
    
    // constructors  - to do in lectures
    /**
     * This constructor creates the Card instance with faceValue and suit given as a parameter.
     * @param faceValue
     * @param suit
     */
    public Card( int faceValue, int suit )
    {
        cardNo = faceValue + suit * NOOFCARDSINSUIT;
    }
    
    /**
     * This constructor takes cardNumber between 0,1,...,51
     * @param cardNumber
     */
    public Card( int cardNumber)
    {
        cardNo = cardNumber % ( 4 * NOOFCARDSINSUIT);
    }
    
    /**
     * get Method for faceValue
     * @return int
     */
    public int getFaceValue()
    {
        return cardNo % NOOFCARDSINSUIT;
    }
    
    /**
     * get Method for suit
     * @return int
     */
    public int getSuit()
    {
        return cardNo / NOOFCARDSINSUIT;
    }
    
    /**
     * This method returns a String representation of a Card class instance
     */
    public String toString()
    {
        return FACES[ getFaceValue() ] + " of " + SUITS[ getSuit() ];
    }
    
    /**
     * This method takes another instance of Card class as parameter. It returns true if the faceValue and the suitValue 's of 
     * cards are the same
     * @param c is another instance of Card class.
     * @return boolean
     */
    public boolean equals( Card c)
    {
        // Returns true if both face value and the suit value of the cards are the same
        return ( this.getFaceValue() == c. getFaceValue()) && ( this.getSuit() == c.getSuit()) ;
    }
    
    /**
     * This method returns the numerical difference between two Card class objects. It's the numerical difference between
     * the faceValue s of the instances.
     * @param c
     * @return
     */
    public int compareTo( Card c)
    {
        // Return the difference between faceValue s of Card instances.
       return ( this.getFaceValue()) - ( c.getFaceValue());
    }
}