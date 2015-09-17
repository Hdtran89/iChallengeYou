package ninja.watdahieuisa.ichallengeyou;

/**
 * Created by watdahieu on 9/16/15.
 */
public class Deck {

    private PlayingCard[] deck;
    private int cardsUsed;

    public Deck(){

    }

    public Deck(boolean includeJokers) {
        if(includeJokers)
            deck = new PlayingCard[54];
        else
            deck = new PlayingCard[52];
        int cardCount = 0;
        for(int suit = 0; suit <= 3; suit++ ){
            for(int value = 0; value <=13; value++)
            {
                deck[cardCount] = new PlayingCard(value,suit);
            }
        }
        if(includeJokers) {
            deck[52] = new PlayingCard(1, PlayingCard.JOKER);
            deck[53] = new PlayingCard(2,PlayingCard.JOKER);
        }
    }

    public void shuffleDeck(){

    }

    public void cardsLeft(){

    }

    public void addDeck(){

    }
}
