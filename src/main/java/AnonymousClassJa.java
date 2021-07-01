public class AnonymousClassJa {
    final int i;

    AnonymousClassJa(int i) {
        this.i = i;
    }

    B getB() {
        return new B() {
            @Override public int getValue() {
                return i;
            }
        };
    }

    interface B {
        int getValue();
    }
}