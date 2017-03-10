import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class HandTest{

Card card;
Deck pack;
Hand hand;

@Before
public void before(){
pack = new Deck();
hand = new Hand(7, "John");
}

@Test
public void canGetNumberOfCardsInHand(){
assertEquals(7, hand.getNumberOfCards());
}





}