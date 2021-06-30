enum class EnumExampleKt(val value: Int) {
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

    abstract fun getEnumValueX2(): Int

    fun getEnumValue() : Int { return value }
}