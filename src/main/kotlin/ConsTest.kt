class ConsTest(y:Int) {
    val x: Int
    var z: Int = 0

    init {
        x = y
    }

    constructor() :this(1) {
        z = 2
    }
}