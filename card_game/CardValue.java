package card_game;

public enum CardValue {

  ACE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(11),
  QUEEN(12),
  KING(13);

  private int numberValue;

  CardValue(int numberValue){
    this.numberValue = numberValue;
  }

  public int getValue(){
    return numberValue;
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