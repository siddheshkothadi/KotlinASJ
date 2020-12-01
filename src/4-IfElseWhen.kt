fun main(){
    // If Expression
    var first = 1
    var second = 2

    val max = if(first<second){
        second
    } else{
        first
    }
    println("max = $max")

    // When Expression
    when(max){
        1 -> println("max == first")
        2 -> println("max == second")
        else -> {
            println("Not first and not second")
        }
    }
}