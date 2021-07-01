class ConstructorExampleKt {
    val x: Int

    constructor(x: Int) {
        this.x = x
    }

    constructor() : this(42)
}