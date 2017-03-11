package card_game;

import java.util.*;

public class Deck{

  private Card card;
  private ArrayList<Card>deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
    deck.clear();
    initialise();
  }

  public void initialise(){
    for (CardSuit suit : CardSuit.values() ){
      for (CardValue value : CardValue.values()){
        this.card = new Card(value,suit);
        this.deck.add(card);
      }
    }
  }

  public int numberOfCards(){
    return deck.size();
  }

  public void shuffle(){
    long seed = System.nanoTime();
    Collections.shuffle(deck, new Random(seed));
  for (int i=0; i < this.deck.size(); i++){
    Card d = deck.get(i);
    System.out.println("card " + (i+1) + " is " + d.getValue() + " of " + d.getSuit());
  }
  }

  public Card getCard(){
    Card c = deck.get(deck.size()-1);
    deck.remove(deck.size()-1);
    return c;
  }


}