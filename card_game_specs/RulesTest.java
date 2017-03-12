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
  }

  @Test
  public void canGetWinnersnNameWhenDeckIsNotShuffled(){
    //dealer.shuffleDeck();
    dealer.deal();
    rules.judgeRound(players);
    assertEquals("Jack", rules.judgeRound(players));
  }

  @Test
  public void getWinnerAfterTwoRoundsAndNoShuffle(){
    //dealer.shuffleDeck();
    dealer.deal();
    dealer.deal();
    rules.judgeTwoRounds(players);
    assertEquals("Jack", rules.judgeTwoRounds(players));
  }



}