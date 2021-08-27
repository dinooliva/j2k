class StaticKt {
    companion object {
       @JvmField val i: Int

        init {
            i = 42
        }

        @JvmStatic fun getStaticI(): Int {
            return i
        }
    }
}