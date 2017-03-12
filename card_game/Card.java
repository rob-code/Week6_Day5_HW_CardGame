package card_game;

public class Card{

  private CardValue value;
  private CardSuit suit;

  public Card(CardValue value, CardSuit suit){
    this.value = value;
    this.suit = suit;
  }

  public CardValue getValue(){
    return this.value;
  }

  public CardSuit getSuit(){
    return this.suit;
  }

  public int getNumberValue(){
    return this.value.getValue1();
  }
  
  public int getAlternateNumberValue(){
    return this.value.getValue2();
  }

}