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
    System.err.println("Class (J): " + ClassJa(5).getExampleI())
    System.err.println("Class (K): " + ClassKt(5).getExampleI())
}

fun runConstructorExample() {
    System.err.println("Constructor (J): " + ConstructorKt().x + " : " + ConstructorKt(5).x)
    System.err.println("Constructor (K): " + ConstructorKt().x + " : " + ConstructorKt(5).x)
}

fun runNestedClassExample() {
    val ncJ = NestedClassJa(6).Nested()
    System.err.println("Nested Class (J): " + ncJ.getExampleI())
    val ncK = NestedClassKt(6).Nested()
    System.err.println("Nested Class (K): " + ncK.getExampleI())
}

fun runNestedStaticClassExample() {
    val sncJ = NestedStaticClassJa.Nested(7)
    System.err.println("Static Nested Class (J): " + sncJ.getExampleI())
    val sncK = NestedStaticClassKt.Nested(7)
    System.err.println("Static Nested Class (K): " + sncK.getExampleI())
}

fun runAnonymousClassExample() {
    val acJ = AnonymousClassJa(8).getB()
    System.err.println("Anonymous Class (J): " + acJ.getValue())
    val acK = AnonymousClassJa(8).getB()
    System.err.println("Anonymous Class (K): " + acK.getValue())
}

fun runLocalClassExample() {
    val acJ = LocalClassJa(9).getB()
    System.err.println("Local Class (J): " + acJ.getValue())
    val acK = LocalClassKt(9).getB()
    System.err.println("Local Class (K): " + acK.getValue())
}

fun runAbstractClassExample() {
    val acJ = AbstractClassJa.A()
    System.err.println(
        "Abstract Class (J): " + " : " + acJ.getAbstractClassValue() + " : " + acJ.getAbstractClassValueX2()
    )
    val acK = AbstractClassKt.A()
    System.err.println(
        "Abstract Class (K): " + " : " + acK.getAbstractClassValue() + " : " + acK.getAbstractClassValueX2()
    )
}

fun runInterfaceExample() {
    val iJ = InterfaceJa.OneF()
    System.err.println("Interface (J): " + iJ.f())
    val iK = InterfaceJa.OneF()
    System.err.println("Interface (K): " + iK.f())
}

fun runEnumExample() {
    for (eJ in EnumJa.values()) {
        System.err.println("Enum (J): " + eJ.ordinal + " : " + eJ.getEnumValue() + " : " + eJ.getEnumValueX2())
    }
    for (eK in EnumKt.values()) {
        System.err.println("Enum (K:) " + eK.ordinal + " : " + eK.getEnumValue() + " : " + eK.getEnumValueX2())
    }
}