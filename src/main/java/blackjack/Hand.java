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
        for (ICard card : cards) {
            if ((sum + card.getPoints()) > BLACK_JACK_POINTS && card.isAce()) {
                sum += ACE_VALUE_AFTER_BUSTED;
            } else {
                sum += card.getPoints();
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
