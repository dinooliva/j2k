class BlockJa {
    boolean block(int i) {
        boolean b = true;
        {
            int j = i;
            if (j == 0) {
                b = false;
            }
        }
        return b;
    }

    boolean blockWithLabel(int i) {
        boolean b = true;
        foo: while (b){
            {
                int j = i;
                if (j == 0) {
                    b = false;
                    continue foo;
                }
                break foo;
            }
        }
        return b;
    }
}
