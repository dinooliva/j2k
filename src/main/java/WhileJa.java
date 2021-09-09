class WhileJa {
    boolean countTo(int count) {
        int i = 0;
        while (i < count) {
            i++;
        }
        return i == count;
    }

    boolean countToWithBreak(int count) {
        int dbl = count * 2;
        int i = 0;
        loop: while (i < dbl) {
            i++;
            if (i == count) break loop;
        }
        return i == count;
    }

    boolean countToWithContinue(int count) {
        int dbl = count * 2;
        int i = 0;
        int j = 0;
        loop: while (i < dbl) {
            i++;
            if (i > count) continue loop;
            j++;
        }
        return i == dbl && j == count;
    }
}