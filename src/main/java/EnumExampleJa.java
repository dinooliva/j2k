enum EnumExampleJa {
    A(1) {
        int getEnumValueX2() {
            return 2;
        }
    },
    B(2) {
        int getEnumValueX2() {
            return 4;
        }
    };

    EnumExampleJa(int value) {
        this.value = value;
    }

    private final int value;

    abstract int getEnumValueX2();

    int getEnumValue() {
        return value;
    }
}
