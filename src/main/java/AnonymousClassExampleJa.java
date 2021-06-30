public class AnonymousClassExampleJa {
    final int i;

    AnonymousClassExampleJa(int i) {
        this.i = i;
    }

    B getB() {
        return new B() {
            int getValue() {
                return i;
            }
        };
    }

    abstract class B {
        abstract int getValue();
    }
}
