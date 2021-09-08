class NestedStaticClassJa {
    static int i;

    static int lowerJ() {
        return Nested.j;
    }

    static class Nested {
        private static int j = 42;

        Nested(int value) {
            i = value;
            j = 2 * value;
        }

        int upperI() {
            return i;
        }
    }
}