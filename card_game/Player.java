package card_game;

import java.util.*;

public class Player{

  private String playerName;
  private ArrayList<Card>hand;

  private Card card;

  public Player(String playerName){
    this.playerName = playerName;
    this.hand = new ArrayList<Card>();
  }

  public String getName(){
    return this.playerName;
  }

  public void addCardToHand(Card card){
    this.card = card;
    this.hand.add(card); 
  }

  public int getNumberOfCards(){
    return hand.size();
  }

  public ArrayList getCardsInHand() {
    return hand;
  }

 





}