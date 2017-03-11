package card_game;

import java.util.*;

public class Dealer{

  private Deck deck;
  private ArrayList<Player>players;

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
   //   System.out.println("player " + (i+1) + " is " + p.getName());
   }

 }
 




}
