package blackjack;

public class Card implements ICard {

    private final CardValue cardValue;

    public Card(String value) {
        cardValue = CardValue.fromLabel(value);
    }

    @Override
    public int getPoints() {
        return cardValue.getValue();
    }

    @Override
    public boolean isAce() {
        return CardValue.ACE == cardValue;
    }

}
