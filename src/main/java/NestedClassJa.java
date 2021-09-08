class NestedClassJa {
    final int i;

    NestedClassJa(int i) {
        this.i = i;
    }

    class Nested {
        int exampleI() {
            return i;
        }
    }
}