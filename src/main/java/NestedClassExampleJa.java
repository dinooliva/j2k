class NestedClassExampleJa {
    int i;

    NestedClassExampleJa(int i) {
        this.i = i;
    }

    class Nested {
        int getExampleI() {
            return i;
        }
    }
}
