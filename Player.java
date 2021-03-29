package cardgame;

// Player - Simple card game player with name and hand of cards
// author: Halil Alperen Gözeten
// date: 20/02/2021
public class Player
{
    // properties
    String name;
    Cards hand;
    
    // constructors

    /**
     * This constructor takes a name as String and initializes the Player by name
     * @param name is a String
     */
    public Player( String name)
    {
        this.name = name;
        hand = new Cards( false);
    }
    
    // methods

    /**
     * This method returns the name of the Player instance.
     * @return
     */
    public String getName()
    {
        // Return the name
        return name;
    }
    
    /**
     * This method takes an instance of Card class as parameter and adds it to the "hand" of the player
     * @param c is an Card Class instance
     */
    public void add( Card c)
    {
        // Add the card to the "hand" of the Player
        this.hand.addTopCard( c);
    }
    
    /**
     * This method returns the top card of the Player
     * @return Card
     */
    public Card playCard()
    {
        // Return the top card of Player
        return this.hand.getTopCard();
    }
    
} // end class Player
