package cardgame;

import java.util.ArrayList;

// Cardgame
// author:
// date:
public class CardGame
{
    // properties
    Cards             fullPack;
    ArrayList<Player> players;
    ScoreCard         scoreCard;
    Cards[]           cardsOnTable;
    int               roundNo;
    int               turnOfPlayer;
    
    // constructors
    public CardGame( Player p1, Player p2, Player p3, Player p4)
    {
        // Create the fullPack and other variables first
        fullPack = new Cards(true);
        players = new ArrayList<>();
        scoreCard = new ScoreCard( 4);
        
        fullPack.shuffle();

        players.add( p1);
        players.add( p2);
        players.add( p3);
        players.add( p4);

        for ( int i = 0; i < fullPack.NOOFCARDSINFULLPACK; i ++) {
            players.get( i % 4).add(fullPack.getTopCard());
        }

        turnOfPlayer = 1;
        roundNo = 1;

        cardsOnTable = new Cards[4];
        // ToDo
    }
    
    // methods
    public boolean playTurn( Player p, Card c)
    {
        // Todo

        if ( !isTurnOf(p) ) {
            return false;
        }

        for ( int i = 0; i < players.size(); i ++ ) {
            if ( players.get(i).getName().equals( p.getName()) ) {
                cardsOnTable[i].addTopCard(c);
                
                if ( this.turnOfPlayer < 4 ) {
                    turnOfPlayer ++;
                    return true;
                }
                
                else {
                    Card maxCard = cardsOnTable[0].cards[cardsOnTable[0].cards.length - 1];

                    for ( int j = 0; j < 4; j ++ ) {
                        if ( cardsOnTable[i].cards[cardsOnTable[i].cards.length - 1].compareTo( maxCard) > 0 ) {
                            maxCard = cardsOnTable[i].cards[cardsOnTable[i].cards.length - 1];
                        }
                    }
                    
                    turnOfPlayer = 1;
                    roundNo ++;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isTurnOf( Player p)
    {
        // ToDo
        for ( int i = 0; i < players.size(); i ++ ) {
            if ( players.get( i).getName().equals(p.getName()) ) {
                if ( i == (turnOfPlayer - 1) ) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isGameOver()
    {
        // ToDo
        return roundNo >= ( fullPack.NOOFCARDSINFULLPACK / 4 ) + 1;
    }
    
    public int getScore( int playerNumber)
    {
        // ToDo
        return scoreCard.getScore( playerNumber);
    }
    
    public String getName( int playerNumber)
    {
        // ToDo
        return players.get( playerNumber).getName();
    }
    
    public int getRoundNo()
    {
        // ToDo
        return roundNo;
    }
    
    public int getTurnOfPlayerNo()
    {
        // ToDo
        return turnOfPlayer;
    }
    
    public Player[] getWinners()
    {
        // ToDo
        Player[] winners;
        winners = new Player[scoreCard.getWinners().length];

        for ( int i = 0; i < scoreCard.getWinners().length; i ++ ) {
            winners[i] = players.get( scoreCard.getWinners()[i]);
        }
        
        return winners;
    }
    
    public String showScoreCard()
    {
        return scoreCard.toString();
    }
    
}