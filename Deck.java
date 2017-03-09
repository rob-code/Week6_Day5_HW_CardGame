import java.util.*;

public class Deck{

  private Card card;
  private ArrayList<String>suits;
  private ArrayList<String>values;
  private ArrayList<Card> deck;

  public Deck(){
    this.suits = new ArrayList<String>();
    this.values = new ArrayList<String>();
    this.deck = new ArrayList<Card>();
    deck.clear();
    initialiseDeck();
  }

  public void initialiseDeck(){
    this.suits.add("Hearts");
    this.suits.add("Diamonds");
    this.suits.add("Clubs");
    this.suits.add("Spades");

    this.values.add("A");
    this.values.add("2");
    this.values.add("3");
    this.values.add("4");
    this.values.add("5");
    this.values.add("6");
    this.values.add("7");
    this.values.add("8");
    this.values.add("9");
    this.values.add("10");
    this.values.add("J");
    this.values.add("Q");
    this.values.add("K");

    for (int s=0; s < this.suits.size(); s++){
      for (int v=0; v < this.values.size(); v++){
        this.card = new Card(values.get(v),suits.get(s));
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
  // for (int i=0; i < this.deck.size(); i++){
  //   Card d = deck.get(i);
  //   System.out.println("card " + (i+1) + " is " + d.getValue() + " of " + d.getSuit());
  // }
  }

public Card getCard(){
      Card c = deck.get(deck.size()-1);
      deck.remove(deck.size()-1);
      return c;
}


}