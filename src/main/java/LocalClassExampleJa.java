public class LocalClassExampleJa {
    final int i;

    LocalClassExampleJa(int i) {
        this.i = i;
    }

    B getB() {
        class C extends B {
            int getValue() {
                return i;
            }
        }
        return new C();
    }

    abstract class B {
        abstract int getValue();
    }
}
