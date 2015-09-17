package ninja.watdahieuisa.ichallengeyou;

/**
 * Created by watdahieu on 9/16/15.
 */
public class PlayingCard {
    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    public final static int JOKER = 4;

    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;


    private int suit;
    private int value;

    public PlayingCard(){
        suit = SPADES;
        value = 1;
    }
    public PlayingCard(int suit, int rank){

    }
    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuitsAsString(){
        switch (suit) {
            case SPADES:    return "Spades";
            case HEARTS:    return "Hearts";
            case DIAMONDS:  return "Diamonds";
            case CLUBS:     return "Clubs";
            default:        return "Joker";
        }
    }
    public String getValueAsString(){
        if(suit == JOKER)
            return "Joker";
        else
        {
            switch (value){
                case 1: return "Ace";
                case 2: return "2";
                case 3: return "3";
                case 4: return "4";
                case 5: return "5";
                case 6: return "6";
                case 7: return "7";
                case 8: return "8";
                case 9: return "9";
                case 10: return "10";
                case 11: return "Jack";
                case 12: return "Queen";
                default: return "King";
            }
        }
    }
}
