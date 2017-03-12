package card_game;

import java.util.*;

public class Rules{

  private ArrayList<Player>players;
  private ArrayList<Card>cards;

public Rules(){
  this.players = new ArrayList<Player>();
  this.cards = new ArrayList<Card>();
}

public void judgeRound(ArrayList<Player> players){
this.players = players;

for (int i=0; i < this.players.size(); i++){
   Player p = (Player) players.get(i);
   System.out.println(p.getName());
   cards = p.getCardsInHand();

for (int j=0; j < this.cards.size(); j++){
  CardSuit suit = (CardSuit) (cards.get(j)).getSuit();
  int value = (cards.get(j)).getNumberValue();
  System.out.println(value + " of " + suit);
}



}


   // for (int i=0; i < this.cards.size(); i++){
   //  this.card = cards.get(i);
   //  System.out.println(card.getValue() + " of " + card.getsuit());
}


}

