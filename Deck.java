import java.util.*;

public class Deck{

  private Card card;
  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
    deck.clear();
    initialiseDeck("Hearts");
    initialiseDeck("Diamonds");
    initialiseDeck("Clubs");
    initialiseDeck("Spades");
  }


  public void initialiseDeck(String suit){
    for (int i=2; i < 11; i++){
      String j = Integer.toString(i);
      System.out.println(j + " of " + suit);
      this.card = new Card(j, suit);
      this.deck.add(card);
    }

  }

  public int numberOfCards(){
    return deck.size();
  }



}