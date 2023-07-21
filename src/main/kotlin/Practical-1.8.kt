fun main() {
    val x= arrayOf(1,2,3)
    println("Using arrayOf method: "+x.contentToString())

    val y= Array<Int>(5) {0}
    println("Using Array<>() method: "+y.contentToString())

    val z= Array<Int>(5) {i: Int -> i }
    println("Using lambda function: "+z.contentToString())

    val a= IntArray(5){3}
    val arrAsStrin = a.joinToString (" ")
    println("Using IntArray method: "+arrAsStrin)

    val b: IntArray = intArrayOf(1,2,3,4,5)
    val arrAsString = b.joinToString(" ")
    println("Using intArrayOf method: "+arrAsString)



}