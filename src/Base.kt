/**
 * - Public by default
 * - Primary Constructor
 * - Init blocks
 * -
 */
class Base(val prop1 : Int, private val prop2 : Int){
    // Note : Not a good practice
    var max : Int? = null

    init{
        max = if(prop1 > prop2) prop1 else prop2
    }

    /** Order of calling
     * 1. Primary Constructor
     * 2. Init block
     * 3. Secondary Constructor
     */

    fun printItems(){
        println(prop1)
        println(prop2)
    }
}