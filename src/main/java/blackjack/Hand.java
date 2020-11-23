package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand implements IHand {

    private static final int BLACK_JACK_POINTS = 21;
    private static final int NUMBER_OF_CARDS_FOR_BLACK_JACK = 2;
    public static final int ACE_VALUE_AFTER_BUSTED = 1;

    private final List<ICard> cards = new ArrayList<>();

    public Hand(ICard firstCard, ICard secondCard) {
        cards.add(firstCard);
        cards.add(secondCard);
    }

    @Override
    public int getPoints() {
        int sum = 0;
        int nbAces = 0;
        for (ICard card : cards) {
            if (card.isAce()) {
                nbAces++;
            } else {
                sum += card.getPoints();
            }
        }

        for (int i = 0; i < nbAces; i++) {
            if ((sum + CardValue.ACE.getValue()) > BLACK_JACK_POINTS) {
                sum += ACE_VALUE_AFTER_BUSTED;
            } else {
                sum += CardValue.ACE.getValue();
            }
        }

        return sum;
    }

    @Override
    public boolean isBusted() {
        return getPoints() > BLACK_JACK_POINTS;
    }

    @Override
    public boolean isBlackJack() {
        return cards.size() == NUMBER_OF_CARDS_FOR_BLACK_JACK && getPoints() == BLACK_JACK_POINTS;
    }

    @Override
    public void addCard(ICard card) {
        cards.add(card);
    }
}
