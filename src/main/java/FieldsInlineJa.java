class FieldsInlineJa {
   final int immutable;
   int mutable;
   int sum;

    FieldsInlineJa(int immutable, int mutable) {
        this.immutable = immutable;
        this.mutable = mutable;
        this.sum = immutable + mutable;
    }
}
