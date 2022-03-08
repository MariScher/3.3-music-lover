fun main() {
    val totalPrice = 15000
    val monthlyBuyer = true

    val standardDiscount = 100
    val increasedDiscount = 0.95
    val monthlyDiscount = 0.99
    val discountStart = 1000
    val discountRise = 10_000


    val result = if (totalPrice > discountRise) (totalPrice * increasedDiscount).toInt()
    else if (totalPrice > discountStart) totalPrice - standardDiscount
    else totalPrice

    val totalResult = if (monthlyBuyer) (result * monthlyDiscount).toInt() else result

    println("Итого: ${totalResult * 100}")
}