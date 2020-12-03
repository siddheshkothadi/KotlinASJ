fun main(){
    // Base Class
    val base = Base(1, 2)
    val item1 = base.prop1
    // val item2 = (base.prop2) => cannot access prop2 because it is private
    base.printItems()   // Calling member functions
    println("max = ${base.max}\n")

    // Data class
    val person1 = PersonInKotlin("Tony", "Stark", "3000")
    val person2 = PersonInKotlin("James", "Bond", "007")
    if(person1 == person2) println("${person1.name} ${person1.surname} and ${person2.name} ${person2.surname} are equal") else println("${person1.name} ${person1.surname} and ${person2.name} ${person2.surname} are not equal\n")

    // Implemented interfaces
    val marvelHero = MarvelHero("Thor")
    val dcHero = DCHero("Flash")

    marvelHero.printInfo()
    dcHero.printInfo()

}