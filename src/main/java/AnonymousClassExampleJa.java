public class AnonymousClassExampleJa {
    final int i;

    AnonymousClassExampleJa(int i) {
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