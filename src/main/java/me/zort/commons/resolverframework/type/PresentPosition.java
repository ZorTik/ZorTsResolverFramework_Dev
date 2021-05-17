package me.zort.commons.resolverframework.type;

import java.util.Random;

public enum PresentPosition {

    RANDOM,
    FIRST,
    LAST;

    private static final Random random = new Random();

    public int get(int size) {
        switch(this) {
            case LAST:
                return size - 1;
            case RANDOM:
                return random.nextInt(size);
        }
        return 0;
    }

}
