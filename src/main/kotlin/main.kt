fun main(args: Array<String>) {
    runFor()
    runConstructor()
    runNestedClass()
    runNestedStaticClass()
    runInterface()
    runEnum()
}

val sep = " : "

fun runFor() {
    val forJa = ForJa()
    val forKt = ForKt()
    System.err.println(
        "For (J): " + forJa.loop(4) + sep + forJa.loopWithBreak(10) + sep + forJa.loopWithContinue(12))
    System.err.println(
        "For (k): " + forKt.loop(4) + sep + forKt.loopWithBreak(10) + sep + forKt.loopWithContinue(12))
}

fun runConstructor() {
    System.err.println("Constructor (J): " + ConstructorKt().x + sep + ConstructorKt(5).x)
    System.err.println("Constructor (K): " + ConstructorKt().x + sep + ConstructorKt(5).x)
}

fun runNestedClass() {
    val ncJ = NestedClassJa(6).Nested()
    System.err.println("Nested Class (J): " + ncJ.getExampleI())
    val ncK = NestedClassKt(6).Nested()
    System.err.println("Nested Class (K): " + ncK.getExampleI())
}

fun runNestedStaticClass() {
    val sncJ = NestedStaticClassJa.Nested(7)
    System.err.println("Static Nested Class (J): " + sncJ.getExampleI())
    val sncK = NestedStaticClassKt.Nested(7)
    System.err.println("Static Nested Class (K): " + sncK.getExampleI())
}

fun runInterface() {
    val iJ = InterfaceJa.OneF()
    System.err.println("Interface (J): " + iJ.f())
    val iK = InterfaceJa.OneF()
    System.err.println("Interface (K): " + iK.f())
}

fun runEnum() {
    for (eJ in EnumJa.values()) {
        System.err.println("Enum (J): " + eJ.ordinal + sep + eJ.getEnumValue() + sep + eJ.getEnumValueX2())
    }
    for (eK in EnumKt.values()) {
        System.err.println("Enum (K:) " + eK.ordinal + sep + eK.getEnumValue() + sep + eK.getEnumValueX2())
    }
}