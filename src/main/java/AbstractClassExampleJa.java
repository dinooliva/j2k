abstract class AbstractClassExampleJa {

    AbstractClassExampleJa(int value) {
        this.value = value;
    }

    private final int value;

    int getAbstractClassValue() {
        return value;
    }

    abstract int getAbstractClassValueX2();

    static class A extends AbstractClassExampleJa {
        A() {
            super(24);
        }

       int getAbstractClassValueX2() {
            return 48;
        }
    }
}