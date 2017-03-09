import static org.junit.Assert.*;
import org.junit.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card("Ace", "Hearts");
  }

  @Test
  public void canGetValue(){
    assertEquals("Ace", card.getValue());
  }

  @Test
  public void canGetSuit(){
    assertEquals("Hearts", card.getSuit());
  }

  @Test
  public void canReadSetValue(){
    card = new Card("Two", "Clubs");
    assertEquals("Two", card.getValue());      
  }

  @Test
  public void canReadSetSuit(){
    card = new Card("Two", "Clubs");
    assertEquals("Clubs", card.getSuit());      
  }





}