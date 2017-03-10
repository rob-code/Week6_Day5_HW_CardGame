import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(CardValue.ACE, CardSuit.HEARTS);
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.ACE, card.getValue());
  }

  @Test
  public void canGetSuit(){
    assertEquals(CardSuit.HEARTS, card.getSuit());
  }

  // @Test
  // public void canReadSetValue(){
  //   card = new Card("Two", "Clubs");
  //   assertEquals("Two", card.getValue());      
  // }

  // @Test
  // public void canReadSetSuit(){
  //   card = new Card("Two", "Clubs");
  //   assertEquals("Clubs", card.getSuit());      
  // }





}