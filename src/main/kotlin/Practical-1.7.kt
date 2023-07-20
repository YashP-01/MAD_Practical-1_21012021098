tailrec fun fact(x:Int,y:Int): Int{
    return if(x<=1) y else fact((x-1),x*y)
}
fun main(){
    println("ans: "+fact(5,1))
}