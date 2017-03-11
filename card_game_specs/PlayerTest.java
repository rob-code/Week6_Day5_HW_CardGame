import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest{

Card card;
Player player;

@Before
public void before(){
card = new Card(CardValue.THREE, CardSuit.HEARTS);
player = new Player(1, "John", card);
}

@Test
public void canGetNumberOfCardsInHand(){
assertEquals(1, player.getNumberOfCards());
}

@Test
public void canGetNameOfPlayer(){
assertEquals("John", player.getPlayerName());
}





}