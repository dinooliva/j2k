class ConstructorPrimaryJa {
    int i;

    ConstructorPrimaryJa(int i) {
        this.i = i + 1;
    }

    ConstructorPrimaryJa() {
        this(41);
    }
}
