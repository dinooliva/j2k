public class JumpJa {
    int jumpWithIf(int x) {
        int i = 0;
        int j = 0;
        while (i < 10) {
            i++;
            j++;
            if (x == 1) break;
            if (x == 2) continue;
            j++;
        }
        return j;
    }

    int jumpWithSwitch(int x) {
        int i = 0;
        int j = 0;
        while (i++ < 10) {
            j++;
            switch (x) {
                case 1:
                    break;
                case 2:
                    continue;
            }
            j++;
        }
        return j;
    }

    int jumpWithIfLabeled(int x) {
        int r = 0;
        int i = 0;
        outer: while (i < 10) {
            i++;
            int j = 0;
            while (j < 10) {
                j++;
                r++;
                if (x == 1) break outer;
                if (x == 2) continue outer;
            }
        }
        return r;
    }

    int jumpWithSwitchLabeled(int x) {
        int r = 0;
        int i = 0;
        outer: while (i < 10) {
            i++;
            int j = 0;
            while (j < 10) {
                j++;
                r++;
                switch (x) {
                    case 1:
                        break outer;
                    case 2:
                        continue outer;
                }

            }
        }
        return r;
    }
}