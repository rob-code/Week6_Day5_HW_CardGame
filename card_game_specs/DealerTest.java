import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import card_game.*;

public class DealerTest{

  ArrayList<Card> hand;
  Player player1;
  Player player2;
  ArrayList<Player> players;
  Dealer dealer;

  @Before
  public void before(){
    hand = new ArrayList<Card>();
    player1 = new Player("Jack");
    player2 = new Player("Jill");
    players = new ArrayList<Player>();
    players.add(player1);
    players.add(player2);
    dealer = new Dealer(players);
  }

  @Test
  public void canGetNumberOfPlayers(){
    assertEquals(2, dealer.numberOfPlayers());
  }

  @Test 
  public void canGetNumberOfCardsInDeck(){
    assertEquals(52, dealer.numberOfCardsInDeck());
  }

  @Test
  public void canShuffleDeck(){
    dealer.shuffleDeck();
  }

  @Test
  public void canDealHands(){
    dealer.deal();
    hand = player1.getCardsInHand();
    for (int i=0; i < hand.size(); i++){
      Card c = (Card) hand.get(i);
      String v = Integer.toString(c.getNumberValue());
      System.out.println(v + " of " + c.getSuit());
    }
    hand = player2.getCardsInHand();
    for (int i=0; i < hand.size(); i++){
      Card c = (Card) hand.get(i);
      String v = Integer.toString(c.getNumberValue());
      System.out.println(v + " of " + c.getSuit());
    }
  }



}
