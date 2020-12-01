fun main(){
    /**
     * Int, Float, Double, Boolean, String, ...
     */

    // Standard way of declaring and initializing variables
    val name : String = "My name"

    // Types can be omitted
    val anotherName = "Another name"
    var number = 1

    // Cannot assign null
    // number = null

    /** Nullable and non-nullable types **/

    // Nullables (question mark at the end)
    var nullableVar : String?
    nullableVar = "I am nullable"
    nullableVar = null

    // Another example
    var nullableInt : Int? = null
    nullableInt = 7

    println("Nullable var = $nullableVar\nNullable Int = $nullableInt")

    /** Elvis Operator **/
    val length : Int = nullableVar?.length ?: -1
    println("The length of nullable var is $length")
}