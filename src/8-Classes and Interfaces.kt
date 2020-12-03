fun main(){

    val base : Base = Base(1, 2)
    val item1 = base.prop1
    // val item2 = (base.prop2) => cannot access prop2 because it is private
    base.printItems()   // Calling member functions
    println("max = ${base.max}")
}