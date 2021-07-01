public class ConstructorJa {
    final int x;

    ConstructorJa(int x) {
        this.x = x;
    }

    ConstructorJa() { this(42); }
}