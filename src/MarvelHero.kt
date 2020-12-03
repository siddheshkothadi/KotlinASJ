class MarvelHero(private val name : String) : SuperHero {
    override val canFly: Boolean
        get() = true

    override fun printInfo() {
       println("$name can fly")
    }
}