class PropertiesJa {
    private final int immutable = 42;
    int getImmutable() {
        return immutable;
    }

    private int mutable = 24;
    int getMutable() {
        return mutable;
    }
    void setMutable(int mutable) {
        this.mutable = mutable;
    }

    private boolean empty = false;
    boolean isEmpty() {
        return empty;
    }
    void setEmpty(boolean empty) {
        this.empty = empty;
    }

    int getSynthesized() {
        if (empty) return 0;
        return mutable;
    }

    void setSynthesized(int value) {
        if (!empty) {
            this.mutable = value;
        }
    }
}
