package card_game;

import java.util.*;

public class Hand{

  private int numberOfCards;
  private String playerName;
  private ArrayList<Card>hand;

  public Hand(int numberOfCards, String playerName){
    this.numberOfCards = numberOfCards;
    this.playerName = playerName;
  }

  public int getNumberOfCards(){
    return this.numberOfCards;
  }

  public String getPlayerName(){
    return this.playerName;
  }




}