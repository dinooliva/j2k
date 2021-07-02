class ClassJa {
    final int i;

    ClassJa(int i) {
        this.i = i;
    }

    int getClassI() {
        return i;
    }

    @Override public String toString() {
        return "toString()";
    }

    @Override public int hashCode () {
        return -1;
    }

    @Override public boolean equals(Object other) {
        return false;
    }
}