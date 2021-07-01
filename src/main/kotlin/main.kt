fun main(args: Array<String>) {
    runClassExample()
    runConstructorExample()
    runNestedClassExample()
    runNestedStaticClassExample()
    runAnonymousClassExample()
    runLocalClassExample()
    runAbstractClassExample()
    runInterfaceExample()
    runEnumExample()
}

fun runClassExample() {
    System.err.println("Class (J): " + ClassExampleJa(5).getExampleI())
    System.err.println("Class (K): " + ClassExampleKt(5).getExampleI())
}

fun runConstructorExample() {
    System.err.println("Constructor (J): " + ConstructorExampleKt().x + " : " + ConstructorExampleKt(5).x)
    System.err.println("Constructor (K): " + ConstructorExampleKt().x + " : " + ConstructorExampleKt(5).x)
}

fun runNestedClassExample() {
    val ncJ = NestedClassExampleJa(6).Nested()
    System.err.println("Nested Class (J): " + ncJ.getExampleI())
    val ncK = NestedClassExampleKt(6).Nested()
    System.err.println("Nested Class (K): " + ncK.getExampleI())
}

fun runNestedStaticClassExample() {
    val sncJ = NestedStaticClassExampleJa.Nested(7)
    System.err.println("Static Nested Class (J): " + sncJ.getExampleI())
    val sncK = NestedStaticClassExampleKt.Nested(7)
    System.err.println("Static Nested Class (K): " + sncK.getExampleI())
}

fun runAnonymousClassExample() {
    val acJ = AnonymousClassExampleJa(8).getB()
    System.err.println("Anonymous Class (J): " + acJ.getValue())
    val acK = AnonymousClassExampleJa(8).getB()
    System.err.println("Anonymous Class (K): " + acK.getValue())
}

fun runLocalClassExample() {
    val acJ = LocalClassExampleJa(9).getB()
    System.err.println("Local Class (J): " + acJ.getValue())
    val acK = LocalClassExampleKt(9).getB()
    System.err.println("Local Class (K): " + acK.getValue())
}

fun runAbstractClassExample() {
    val acJ = AbstractClassExampleJa.A()
    System.err.println(
        "Abstract Class (J): " + " : " + acJ.getAbstractClassValue() + " : " + acJ.getAbstractClassValueX2()
    )
    val acK = AbstractClassExampleKt.A()
    System.err.println(
        "Abstract Class (K): " + " : " + acK.getAbstractClassValue() + " : " + acK.getAbstractClassValueX2()
    )
}

fun runInterfaceExample() {
    val iJ = InterfaceExampleJa.OneF()
    System.err.println("Interface (J): " + iJ.f())
    val iK = InterfaceExampleJa.OneF()
    System.err.println("Interface (K): " + iK.f())
}

fun runEnumExample() {
    for (eJ in EnumExampleJa.values()) {
        System.err.println("Enum (J): " + eJ.ordinal + " : " + eJ.getEnumValue() + " : " + eJ.getEnumValueX2())
    }
    for (eK in EnumExampleKt.values()) {
        System.err.println("Enum (K:) " + eK.ordinal + " : " + eK.getEnumValue() + " : " + eK.getEnumValueX2())
    }
}