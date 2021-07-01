class StaticKt {
    companion object {
        val i: Int

        init {
            i = 42
        }

        fun getStaticI(): Int {
            return i
        }
    }
}