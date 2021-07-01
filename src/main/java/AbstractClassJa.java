abstract class AbstractClassJa {
    final int value;

    AbstractClassJa(int value) {
        this.value = value;
    }

    int getAbstractClassValue() {
        return value;
    }

    abstract int getAbstractClassValueX2();

    static class A extends AbstractClassJa {
       A() {
            super(24);
        }

       @Override int getAbstractClassValueX2() {
            return 48;
        }
    }
}