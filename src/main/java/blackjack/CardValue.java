package blackjack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public enum CardValue {
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("J", 10),
    QUEEN("Q", 10),
    KING("K", 10),
    ACE("A", 11);

    private String label;
    private int value;

    CardValue(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public int getValue() {
        return value;
    }

    public static CardValue fromLabel(String label) {
        return Arrays.stream(values()).filter(e -> e.label.equals(label))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Cannot get a CardValue from " + label));
    }
}
