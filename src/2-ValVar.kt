fun main(){
    /**
     * Val - Immutable variable
     */
    val name = "NoName"
    println("Hi $name")
    /** The code below will throw an error **/
    // name = "New Name"
    println("Hi $name")

    /**
     * Var - Mutable variable
     */
    var anotherName = "Another name"
    print("Hello $anotherName\n")
    anotherName = "New Name"
    print("Hello $anotherName")
}