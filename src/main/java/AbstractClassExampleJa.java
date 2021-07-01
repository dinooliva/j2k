abstract class AbstractClassExampleJa {
    final int value;

    AbstractClassExampleJa(int value) {
        this.value = value;
    }

    int getAbstractClassValue() {
        return value;
    }

    abstract int getAbstractClassValueX2();

    static class A extends AbstractClassExampleJa {
       A() {
            super(24);
        }

       @Override int getAbstractClassValueX2() {
            return 48;
        }
    }
}