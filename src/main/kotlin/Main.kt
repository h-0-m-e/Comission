fun main() {
    val amount = 100000
    val minPercent = 35
    var currentPercent = if ((amount/10000)*75 > minPercent) (amount/10000)*75 else minPercent

    println("Ваша комиссия составляет $currentPercent р.")

}