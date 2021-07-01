class LocalClassJa {
    final int i;

    LocalClassJa(int i) {
        this.i = i;
    }

    B getB() {
        class C implements B {
            @Override public int getValue() {
                return i;
            }
        }
        return new C();
    }

    interface B {
        int getValue();
    }
}