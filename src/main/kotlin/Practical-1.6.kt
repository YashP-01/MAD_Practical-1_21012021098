fun add(x: Int,y: Int): Int{
    return x+y
}
fun subtr(x: Int,y: Int): Int{
    return x-y
}
fun multi(x: Int,y: Int): Int{
    return x*y
}
fun div(x: Int,y: Int): Int{
    return x/y
}

fun main(){
    val x = 173
    val y = 11
    println("Addition of: "+add(x, y))
    println("Subtraction of: "+subtr(x, y))
    println("Multiplication of: "+multi(x, y))
    println("Division of: "+div(x, y))
}