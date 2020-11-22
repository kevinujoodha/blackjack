package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand implements IHand {
    private List<ICard> cards = new ArrayList<>();
	
    public Hand(ICard firstCard, ICard secondCard) {
        cards.add(firstCard);
        cards.add(secondCard);
    }

    @Override
    public int getPoints() {
        return cards.stream()
                .mapToInt(ICard::getPoints)
                .sum();
    }

    @Override
    public boolean isBusted() {
        return false;
    }

    @Override
    public boolean isBlackJack() {
        return false;
    }

    @Override
    public void addCard(ICard card) {
        cards.add(card);
    }
}
