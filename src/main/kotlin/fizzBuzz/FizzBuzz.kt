package fizzBuzz

fun fizzBuzz(n: Int): Array<String> {
    val fizzBuzz = arrayListOf<String>()
    for (i in 1 until n + 1 ){
        var toAdd = ""
        if(i % 3 == 0 ){
            toAdd = "Fizz"
        }
        if (i % 5 == 0){
            toAdd += "Buzz"
        }
        if (toAdd == ""){
            toAdd = i.toString()
        }
        fizzBuzz.add(toAdd)
    }

    return fizzBuzz.toTypedArray()
}