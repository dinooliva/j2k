class InstanceofJa {
    boolean isInstanceof(A a){
        return a instanceof B;
    }

    static class A {}
    static class B extends A {}
}
