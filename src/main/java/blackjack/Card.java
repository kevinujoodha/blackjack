package blackjack;

public class Card implements ICard {

    private CardValue cardValue;

    public Card(String value) {
        cardValue = CardValue.fromLabel(value);
    }

    @Override
    public int getPoints() {
        return cardValue.getValue();
    }
}
