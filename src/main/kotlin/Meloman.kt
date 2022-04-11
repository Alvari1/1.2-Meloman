const val DISCOUNT_STANDARD = 100U
const val DISCOUNT_PERC_COMMON = 5U
const val DISCOUNT_PERC_MELOMAN = 1U

fun main() {
    var isMeloman: Boolean = true

    print("Введите стоимость покупки: ")
    val orderAmount = readLine()?.toUInt() ?: return

    var totalPrice: UInt
    when (orderAmount) {
        in 0U..1000U -> {
            totalPrice = orderAmount
        }
        in 1001U..10000U -> {
            totalPrice = orderAmount - DISCOUNT_STANDARD
        }
        else -> {
            totalPrice = orderAmount * (100U - DISCOUNT_PERC_COMMON) / 100U
            if (isMeloman) {
                totalPrice = totalPrice * (100U - DISCOUNT_PERC_MELOMAN) / 100U
            }
        }
    }
    println("Стоимости вашего заказа: $totalPrice")
}