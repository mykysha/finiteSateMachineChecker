package org.mykytaderhunov;


public class Transition {
    private final int to;

    private final char letter;

    public Transition(int to, char letter) {
        this.to = to;
        this.letter = letter;
    }

    public int getTo() {
        return to;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Transition that = (Transition) o;

        if (to != that.to) {
            return false;
        }

        return letter == that.letter;
    }

    @Override
    public int hashCode() {
        int result = to;
        result = 31 * result + (int) letter;

        return result;
    }
}
