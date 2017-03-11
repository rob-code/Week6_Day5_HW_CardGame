package card_game;

import java.util.*;

public class Player{

  private int numberOfCards;
  private String playerName;
  private Card card;
  private ArrayList<Card>hand;

  public Player(int numberOfCards, String playerName, Card card){
    this.numberOfCards = numberOfCards;
    this.playerName = playerName;
    this.card = card;
    this.hand = new ArrayList<Card>();
  }

  public void addCardToHand(Card card){
    this.hand.add(card); 
  }

  public int getNumberOfCardsInHand(){
    return hand.size();
  }

  public ArrayList getCardsInHand() {
    return hand;
  }

  public int getNumberOfCards(){
    return this.numberOfCards;
  }

  public String getPlayerName(){
    return this.playerName;
  }





}