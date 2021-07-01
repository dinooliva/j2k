class NestedStaticClassExampleJa {
    static int i;

    static class Nested {
        Nested(int j) {
            i = j;
        }

        int getExampleI() {
            return i;
        }
    }
}