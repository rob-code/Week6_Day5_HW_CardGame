package card_game;

import java.util.*;

// the dealer deals the cards and judges the game

public class Dealer{

  private Deck deck;
  private ArrayList<Player>players;
  private Player player;

  public Dealer(ArrayList<Player> players){
    this.deck = new Deck();
    this.players = players;
  }

  public int numberOfPlayers(){
    return this.players.size();
  }

  public int numberOfCardsInDeck(){
    return this.deck.numberOfCards();
  }

  public void shuffleDeck(){
    this.deck.shuffle();
  }

  public void deal(){
   for (int i=0; i < this.players.size(); i++){
    Player p = (Player) players.get(i);
    p.addCardToHand(this.deck.getCard());
  }
}

public void dealSingleCard(Player player){
  this.player = player;
  player.addCardToHand(this.deck.getCard());
}

public String checkPlayerResult(Player player){
this.player = player;
int score = this.player.getCurrentScore();
String result;

if (score == 21){
  return result = "Pontoon!";
}
else if (score > 21)
{
  return result = "Bust!";
}
else
{
  return result = "Play again?";
}




}

}
