package blackjack;

public interface IHand {

    int getPoints();

    boolean isBusted();

    boolean isBlackJack();

    void addCard(ICard card);

}
