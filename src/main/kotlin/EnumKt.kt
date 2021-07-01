enum class EnumKt {
    A(1) {
        override fun getEnumValueX2(): Int {
            return 2
        }
    },
    B(2) {
        override fun getEnumValueX2(): Int {
            return 4
        }
    };

    val value: Int

    constructor(value: Int) {
        this.value = value
    }

    fun getEnumValue(): Int {
        return value
    }

    abstract fun getEnumValueX2(): Int
}