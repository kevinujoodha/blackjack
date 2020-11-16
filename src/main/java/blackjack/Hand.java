package blackjack;

import java.util.ArrayList;

public class Hand implements IHand {
	private ArrayList<ICard> _Cards = new ArrayList<ICard>();
	
	public Hand(ICard firstCard, ICard secondCard){
		_Cards.add(firstCard);
		_Cards.add(secondCard);
	}
	
	public int Points() {
		return 0;
	}

	public boolean IsBusted() {
		return false;
	}

	public boolean IsBlackjack() {
		return false;
	}

	public void AddCard(ICard card) {
		
	}
	
	private int getPoint(){
        return 0;
    }
}
