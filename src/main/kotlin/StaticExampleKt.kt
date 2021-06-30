class StaticExampleKt {
    companion object {
        var i = 0

        init {
            i = 42
        }

        fun getStaticI(): Int {
            return i
        }
    }
}