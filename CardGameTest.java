import java.util.Scanner;
import cardgame.*;

// CardGameTest
// author:
// date:
public class CardGameTest
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        System.out.println( "Start of CardGameTest\n");
        
        // CONSTANTS
        
        // VARIABLES
        Card       c;
        Card       c2;
        Cards      cards;
        ScoreCard  scores;
        Player     p;
        Player     p1;
        Player     p2;
        Player     p3;
        Player     p4;
        CardGame   game;
        
        // PROGRAM CODE
        
        // test Card class
        c = new Card( 0);
        c2 = new Card(39);

        p1 = new Player( "p1");
        p2 = new Player( "p2");
        p3 = new Player( "p3");
        p4 = new Player( "p4");

        System.out.println( c);
        System.out.println();
        System.out.println( c2);
        System.out.println(c.equals(c2));
        System.out.println( c.compareTo(c2));
        System.out.println( c2.compareTo(c));
        
        // test Cards class
        cards = new Cards( true);
        cards.addTopCard( c);
        System.out.println(cards.addTopCard( c));
        cards.testOnlyPrint();  // remove method after testing!
        System.out.println();
        cards.shuffle();
        cards.testOnlyPrint();
        
        // test ScoreCard class
        scores = new ScoreCard( 4);
        scores.update( 3, 1);
        scores.update( 1, 2);
        System.out.println( "\n" + scores );
        System.out.println( scores.getWinners());

        game = new CardGame(p1, p2, p3, p4);
        
        // test Player class
        // ToDo
        
        // test CardGame class too?
        // Todo
        
        // Once you have all the bits working, complete the MyCardGame program
        // that provides a menu allowing any of the players to play their card,
        // an option to see the score card, and one to quit the game at any time.
        // When the game is over it should print out the winners.
        
        System.out.println( "\nEnd of CardGameTest\n" );
    }
    
} // end of class CardGameTest
