fun main(args: Array<String>) {
    runIfStatement()
    runForStatement()
    runClass()
    runConstructor()
    runNestedClass()
    runNestedStaticClass()
    runAnonymousClass()
    runLocalClass()
    runAbstractClass()
    runInterface()
    runEnum()
}

val sep = " : "

fun runIfStatement() {
    val ifJa = IfStatementJa()
    val ifKt = IfStatementKt()
    System.err.println("If (J): " + ifJa.fromBoolIf(false) + sep + ifJa.fromBoolIfElse(true))
    System.err.println("If (K): " + ifKt.fromBoolIf(false) + sep + ifKt.fromBoolIfElse(true))
}

fun runForStatement() {
    val forJa = ForStatementJa()
    val forKt = ForStatementKt()
    System.err.println(
        "For (J): " + forJa.loop(4) + sep + forJa.loopWithBreak(10) + sep + forJa.loopWithContinue(12))
    System.err.println(
        "For (k): " + forKt.loop(4) + sep + forKt.loopWithBreak(10) + sep + forKt.loopWithContinue(12))
}

fun runClass() {
    val cJa = ClassJa(5)
    val cKt = ClassKt(5)
    System.err.println(
        "Class (J): " + cJa.getClassI() + sep + cJa.toString() + sep + cJa.hashCode() + sep + cJa.equals(cJa))
    System.err.println(
        "Class (K): " + cKt.getClassI() + sep + cKt.toString() + sep + cKt.hashCode() + sep + cKt.equals(cKt))
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

fun runAnonymousClass() {
    val acJ = AnonymousClassJa(8).getB()
    System.err.println("Anonymous Class (J): " + acJ.getValue())
    val acK = AnonymousClassJa(8).getB()
    System.err.println("Anonymous Class (K): " + acK.getValue())
}

fun runLocalClass() {
    val acJ = LocalClassJa(9).getB()
    System.err.println("Local Class (J): " + acJ.getValue())
    val acK = LocalClassKt(9).getB()
    System.err.println("Local Class (K): " + acK.getValue())
}

fun runAbstractClass() {
    val acJ = AbstractClassJa.A()
    System.err.println(
        "Abstract Class (J): " + sep + acJ.getAbstractClassValue() + sep + acJ.getAbstractClassValueX2()
    )
    val acK = AbstractClassKt.A()
    System.err.println(
        "Abstract Class (K): " + sep + acK.getAbstractClassValue() + sep + acK.getAbstractClassValueX2()
    )
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