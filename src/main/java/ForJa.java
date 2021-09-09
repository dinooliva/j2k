class ForJa {
    boolean countTo(int count) {
        int i;
        for (i = 0; i < count; i++) {
        }
        return i == count;
    }

    boolean countToWithBreak(int count) {
        int dbl = count * 2;
        int i;
        loop: for (i = 0; i < dbl; i++) {
            if (i == count) break loop;
        }
        return i == count;
    }

    boolean countToWithContinue(int count) {
        int dbl = count * 2;
        int i;
        int j = 0;
        loop: for (i = 0; i < dbl; i++) {
            if (i >= count) continue loop;
            j++;
        }
        return i == dbl && j == count;
    }
}