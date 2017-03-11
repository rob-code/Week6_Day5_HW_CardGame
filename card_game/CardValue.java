package card_game;

// there's a whole lot of special magic behind the scenes with enums...

public enum CardValue {

  ACE(1, 111),
  TWO(2, 112),
  THREE(3, 113),
  FOUR(4, 114),
  FIVE(5, 115),
  SIX(6, 116),
  SEVEN(7, 117),
  EIGHT(8, 118),
  NINE(9, 119),
  TEN(10, 1110),
  JACK(11, 1111),
  QUEEN(12, 1112),
  KING(13, 1113);

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
      case ACE:       return "ace";
      case TWO:       return "two";
      case THREE:     return "three";
      case FOUR:      return "four";
      case FIVE:       return "five";
      case SIX:       return "six";
      case SEVEN:     return "seven";
      case EIGHT:     return "eight";
      case NINE:      return "nine";
      case TEN:       return "ten";
      case JACK:      return "jack";
      case QUEEN:     return "queen";
      case KING:      return "king";
      default:        return "unspecified";
    }

  }

}