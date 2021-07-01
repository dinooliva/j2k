class NestedClassJa {
    final int i;

    NestedClassJa(int i) {
        this.i = i;
    }

    class Nested {
        int getExampleI() {
            return i;
        }
    }
}