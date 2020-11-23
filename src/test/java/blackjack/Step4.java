package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class Step4 {

	@Test
	public void should_have_fifteen_when_cards_are_ten_and_four_and_ace(){
		ICard firstCard = new Card("10");
		ICard secondCard = new Card("4");
		ICard thirdCard = new Card("A");
		IHand hand = new Hand(firstCard, secondCard);
		hand.addCard(thirdCard);
		assertEquals(15, hand.getPoints());
		assertFalse(hand.isBusted());
	}

	@Test
	public void should_have_twenty_twi_and_busted_when_cards_are_ten_and_four_and_seven_and_ace(){
		ICard firstCard = new Card("10");
		ICard secondCard = new Card("4");
		ICard thirdCard = new Card("7");
		ICard fourthCard = new Card("A");
		IHand hand = new Hand(firstCard, secondCard);
		hand.addCard(thirdCard);
		hand.addCard(fourthCard);
		assertEquals(22, hand.getPoints());
		assertTrue(hand.isBusted());
	}

	@Test
	public void should_have_thirteen_when_cards_are_ace_and_ace_and_ace(){
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("A");
		ICard thirdCard = new Card("A");
		IHand hand = new Hand(firstCard, secondCard);
		hand.addCard(thirdCard);
		assertEquals(13, hand.getPoints());
		assertFalse(hand.isBusted());
	}

	@Test
	public void should_have_fourteen_when_cards_are_all_aces(){
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("A");
		ICard thirdCard = new Card("A");
		ICard lastCard = new Card("A");
		IHand hand = new Hand(firstCard, secondCard);
		hand.addCard(thirdCard);
		hand.addCard(lastCard);
		assertEquals(14, hand.getPoints());
		assertFalse(hand.isBusted());
	}

	@Test
	public void testAndrei(){
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("10");
		ICard thirdCard = new Card("2");
		IHand hand = new Hand(firstCard, secondCard);
		hand.addCard(thirdCard);
		assertEquals(13, hand.getPoints());
	}
}
