import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import card_game.*;

public class PlayerTest{

  Card card;
  Player player;

  @Before
  public void before(){
    player = new Player("John");
  }

  @Test
  public void canGetNumberOfCardsInHand(){
    card = new Card(CardValue.THREE, CardSuit.HEARTS);
    player.addCardToHand(card);
    player.addCardToHand(card);
    assertEquals(2, player.getNumberOfCards());
  }

  @Test
  public void canGetNameOfPlayer(){
    assertEquals("John", player.getName());
  }

  @Test
  public void canGetCardsInHand(){
    card = new Card(CardValue.THREE, CardSuit.HEARTS);
    player.addCardToHand(card);
    player.addCardToHand(card);
    ArrayList hand = player.getCardsInHand();

    for (int i=0; i < hand.size(); i++){
     Card c = (Card) hand.get(i);
     System.out.println(c.getValue() + " " + c.getSuit());
   }



 }




}