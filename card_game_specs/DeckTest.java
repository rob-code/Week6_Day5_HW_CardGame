import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest{

  Card card;
  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }

  @Test
  public void canGetNumberOfCardsInDeck(){
    assertEquals(52, deck.numberOfCards());
  }

  @Test
  public void getTopCardFromDeck(){
   Card card = deck.getCard();
   System.out.println(card.getNumberValue());
   System.out.println(card.getValue() + " " + card.getSuit());    
  }

  @Test
  public void canShuffleTheDeck(){
    deck.shuffle();
  }








}

