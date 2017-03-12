package card_game;

import java.util.*;

public class Rules{

  private ArrayList<Player>players;
  private ArrayList<Card>cards;

  public Rules(){
    this.players = new ArrayList<Player>();
    this.cards = new ArrayList<Card>();
  }

  public String judgeRound(ArrayList<Player> players){
    this.players = players;

    int winningCardValue = 0;
    String winnersName = "";
    String winnersCardDescription = "";

    for (int i=0; i < this.players.size(); i++){
     Player p = (Player) players.get(i);
     cards = p.getCardsInHand();

     for (int j=0; j < this.cards.size(); j++){
      String name = p.getName();
      int value = (cards.get(j)).getNumberValue();
      CardValue stringValue = (CardValue) (cards.get(j)).getValue();
      CardSuit suit = (CardSuit) (cards.get(j)).getSuit();
      
      System.out.println(name + " has card : " + value + "/" + stringValue + " of " + suit);
      
      if( value > winningCardValue ){
        winningCardValue = value;
        winnersName = name;
        winnersCardDescription = "The winner is " + name + " with card : " + value + "/" + stringValue + " of " + suit;
      }
      else if (value == winningCardValue) {
        winnersCardDescription = "It's a draw!";
        winnersName = "draw";
      }
    }
  }
  System.out.println(winnersCardDescription);
  return winnersName;
}




public String judgeTwoRounds(ArrayList<Player> players){
  this.players = players;

  int winningHandTotal = 0;
  String winnersName = "";
  String winningDescription = "";

  for (int i=0; i < this.players.size(); i++){
   Player p = (Player) players.get(i);
   cards = p.getCardsInHand();
   String name = p.getName();
   int handTotal = 0;

   for (int j=0; j < this.cards.size(); j++){
    int value = (cards.get(j)).getNumberValue();
    CardSuit suit = (CardSuit) (cards.get(j)).getSuit();
    System.out.println(name + " has : " + Integer.toString(value) + " of " + suit);
    handTotal += value;


  }

  

    if( handTotal > winningHandTotal){
      winningHandTotal = handTotal;
      winnersName = name;
      winningDescription = "The winner is " + winnersName + " with a total of : " + handTotal;
    }
    else if (handTotal == winningHandTotal) {
      winningDescription = "It's a draw!";
      winnersName = "draw";
    }
  }

  System.out.println(winningDescription);
  return winnersName;
}


}

