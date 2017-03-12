package card_game;

public class Card{

  private CardValue value;
  private CardSuit suit;

  public Card(CardValue value, CardSuit suit){
    this.value = value;
    this.suit = suit;
  }

  public String getValue(){
    return this.value.toString();
  }

  public String getSuit(){
    return this.suit.toString();
  }

  public int getNumberValue(){
    return this.value.getValue1();
  }
  
  public int getAlternateNumberValue(){
    return this.value.getValue2();
  }

}