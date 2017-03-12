package card_game;

// there's a whole lot of magic going on behind the scenes with enums...the least of which is that the compiler assigns the constants in brackets to the constructor argument and so we can associate any values we want with our constant. Enums are a datatype and should aways be used to contain constants which will never change in our program. 

public enum CardValue {

  TWO(2, 2),
  THREE(3, 3),
  FOUR(4, 4),
  FIVE(5, 5),
  SIX(6, 6),
  SEVEN(7, 7),
  EIGHT(8, 8),
  NINE(9, 9),
  TEN(10, 10),
  JACK(10, 10),
  QUEEN(10, 10),
  KING(10, 10),
  ACE(11, 1);

  private int numberValue1;
  private int numberValue2;

  CardValue(int numberValue1, int numberValue2){
    this.numberValue1 = numberValue1;
    this.numberValue2 = numberValue2;
  }

  public int getValue1(){
    return numberValue1;
  }

  public int getValue2(){
    return numberValue2;
  }

  public String toString() {
    switch(this) {
      case TWO:       return "two";
      case THREE:     return "three";
      case FOUR:      return "four";
      case FIVE:      return "five";
      case SIX:       return "six";
      case SEVEN:     return "seven";
      case EIGHT:     return "eight";
      case NINE:      return "nine";
      case TEN:       return "ten";
      case JACK:      return "jack";
      case QUEEN:     return "queen";
      case KING:      return "king";
      case ACE:       return "ace";
      default:        return "unspecified";
    }

  }

}