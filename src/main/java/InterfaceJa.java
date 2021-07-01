interface InterfaceJa {
    int f();

    class OneF implements InterfaceJa {
        @Override public int f() {
            return 1;
        }
    }
}