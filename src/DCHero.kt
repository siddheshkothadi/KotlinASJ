class DCHero(private val name : String) : SuperHero {
    override val canFly: Boolean
        get() = false

    override fun printInfo() {
        println("$name cannot fly")
    }
}