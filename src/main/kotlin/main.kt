fun main() {

    val tax: Float = 0.0075F
    val minTax: Int = 35
    val amount: Int = 10000

    val realTax = if ((amount * tax) > 35) {
        amount * tax
    } else {
        minTax
    }.toInt()

    print(realTax)

}