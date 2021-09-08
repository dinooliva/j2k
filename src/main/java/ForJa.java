class ForJa {
    int loop(int n) {
        int i = 0;
        for (int j = 0; j < n; j++) {
            i++;
        }
        return i;
    }

    int loopWithBreak(int n) {
        int i = 0;
        int j;
        out: for (j = 0; j < n; j++) {
            if (j > n/2) {
                break out;
            }
            i++;
        }
        return j == n ? -1 : i;
    }

    int loopWithContinue(int n) {
        int i = 0;
        int j;
        out: for (j = 0; j < n; j++) {
            if (j > n / 2) {
                continue out;
            }
            i++;
        }
        return j == n ? i : -1;
    }
}