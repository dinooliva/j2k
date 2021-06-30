interface InterfaceExampleKt {
    fun f(): Int

    class OneF : InterfaceExampleKt {
        override fun f(): Int {
            return 1
        }
    }
}