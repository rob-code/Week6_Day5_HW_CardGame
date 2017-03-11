package card_game;

import java.util.*;

public class Dealer{

  private Deck deck;
  private ArrayList<Player>players;

  public Dealer(ArrayList<Player> players){
    this.deck = new Deck();
    this.players = players;
  }

  public void startGame(){
    this.deck.shuffle();
    System.out.println("players size is: " + this.players.size());

    // for (int i=0; i < this.players.size(); i++){
    //   Player p = (Player) players.get(i);
    //   System.out.println("player " + (i+1) + " is " + p.getName());
    // }

  }

  public int numberOfCardsInDeck(){
    return this.deck.numberOfCards();
  }

  public int numberOfPlayers(){
    return this.players.size();
  }





}
