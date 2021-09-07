class ConstructorPrimaryKt(i: Int) {
    var i: Int

    init {
        this.i = i + 1
    }

    constructor() : this(41)
}