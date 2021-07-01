interface InterfaceKt {
    fun f(): Int

    class OneF : InterfaceKt {
        override fun f(): Int {
            return 1
        }
    }
}