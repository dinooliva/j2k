class SwitchJa {
    int basic(int i) {
        int retval = 0;
        switch (i) {
            case 1: retval += 10; break;
            case 2: retval += 20; break;
            default: retval += i * 100;
        }
        return retval;
    }

    int simpleFallThrough(int i) {
        int retval = 0;
        switch (i) {
            case 1:
            case 2: retval += 20; break;
            default: retval += i * 100;
        }
        return retval;
    }

    int fallThrough(int i) {
        int retval = 0;
        switch (i) {
            case 1: retval += 10;
            case 2: retval += 20; break;
            default: retval += i * 100;
        }
        return retval;
    }
}