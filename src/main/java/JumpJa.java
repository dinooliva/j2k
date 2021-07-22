public class JumpJa {
    int jumpWithIf(int x) {
        int i = 0;
        int j = 0;
        while (i++ < 10) {
            j++;
            if (x == 0) break;
            if (x == 1) continue;
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
                case 0:
                    break;
                case 1:
                    continue;
            }
            j++;
        }
        return j;
    }
}