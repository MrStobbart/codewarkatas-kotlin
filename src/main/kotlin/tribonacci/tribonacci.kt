package tribonacci

fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {

    if( n == 0){
        return doubleArrayOf()
    }

    if( n == 1){
        return signature.dropLast(2).toDoubleArray()
    }

    if( n == 2){
        return signature.dropLast(1).toDoubleArray()
    }
    
    val tribonacci = signature.toMutableList()
    for (i in 3 until n){
        val nextElement = tribonacci[i - 3] + tribonacci[i - 2] + tribonacci[i - 1]
        tribonacci.add(nextElement)
    }

    return tribonacci.toDoubleArray()
}