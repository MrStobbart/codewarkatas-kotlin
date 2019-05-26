package rainfall

fun mean(town:String, strng:String):Double {
    val entry = getCorrespondingDataEntry(town, strng)
    entry ?: return -1.0
    val rainfallDays = createRainfallDaysList(entry)
    return getMean(rainfallDays)
}
fun variance(town:String, strng:String):Double {
    val entry = getCorrespondingDataEntry(town, strng)
    entry ?: return -1.0
    val rainfallDays = createRainfallDaysList(entry)
    return getVariance(rainfallDays)
}

fun getMean(list: List<Double>): Double{
    return list.reduce { sum, double -> sum + double } / list.size
}

fun getVariance(list: List<Double>): Double{
    val mean = getMean(list)
    val deltaSqSum = list.fold(0.0,  { sum, double ->
        val delta = double - mean
        sum + (delta * delta)
    })
    return deltaSqSum / list.size
}

fun getCorrespondingDataEntry(town: String, strng: String): String?{
    val entries = strng.split("\n")
    val entry = entries.find { entry -> entry.contains(town) }
    entry ?: return null
    return entry.split(":")[1]
}

fun createRainfallDaysList(data: String): List<Double>{

    val entries = data.split(",")
    return  entries.map { entry ->  entry.substring(3).toDouble()}

}