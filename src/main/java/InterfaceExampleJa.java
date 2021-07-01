interface InterfaceExampleJa {
    int f();

    class OneF implements InterfaceExampleJa {
        @Override public int f() {
            return 1;
        }
    }
}