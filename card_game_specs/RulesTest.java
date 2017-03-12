import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import card_game.*;

public class RulesTest{

  Player player1;
  Player player2;
  ArrayList<Player> players;
  Dealer dealer;
  Rules rules;

  @Before
  public void before(){

    player1 = new Player("Jack");
    player2 = new Player("Jill");
    players = new ArrayList<Player>();
    players.add(player1);
    players.add(player2);
    dealer = new Dealer(players);
    rules = new Rules();
  //dealer.shuffleDeck();
    dealer.deal();
  }

  @Test
  public void canGetWinnersnNameWhenDeckIsNotShuffled(){
    assertEquals("Jack", rules.judgeRound(players));
  }






}