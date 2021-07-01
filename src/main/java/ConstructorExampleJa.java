public class ConstructorExampleJa {
    final int x;

    ConstructorExampleJa(int x) {
        this.x = x;
    }

    ConstructorExampleJa() { this(42); }
}