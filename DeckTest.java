import static org.junit.Assert.*;
import org.junit.*;

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
  public void canShuffleTheDeck(){
    deck.shuffle();
  }

  @Test
  public void getTopCardFromDeck(){
   Card card = deck.getCard();
   System.out.println(card.getValue() + " " + card.getSuit());    
  }






}

