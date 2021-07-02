internal class ClassKt {
    val i: Int

    constructor(i: Int) {
        this.i = i
    }

    fun getClassI(): Int {
        return i
    }

    override fun toString(): String {
        return "toString()"
    }

    override fun hashCode(): Int {
        return -1
    }

    override fun equals(other: Any?): Boolean {
        return false
    }
}