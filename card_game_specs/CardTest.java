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
    assertEquals("ace", card.getValue());
  }

  @Test
  public void canGetSuit(){
    assertEquals("Hearts", card.getSuit());
  }

  @Test
  public void canGetNumberValue(){
    assertEquals(11, card.getNumberValue());      
  }

  @Test
  public void canGetAlernateNumberValue(){
    assertEquals(1, card.getAlternateNumberValue());      
  }





}