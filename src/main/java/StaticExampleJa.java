class StaticExampleJa {
    static int i;

    static {
        i = 42;
    }

    static int getStaticI() {
        return i;
    }
}