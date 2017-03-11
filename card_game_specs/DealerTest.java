import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class DealerTest{

  Player player1;
  Player player2;
  ArrayList<Player> players;
  Dealer dealer;

  @Before
  public void before(){
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





}
