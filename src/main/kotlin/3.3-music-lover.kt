fun main() {
    val totalPrice = 15000.00
    val monthlyBuyer = true

    val standardDiscount = 100
    val increasedDiscount = 0.95
    val monthlyDiscount = 0.99
    val discountStart = 1001
    val discountRise = 10_001


    val result = if (totalPrice >= discountRise) totalPrice * increasedDiscount
    else if (totalPrice >= discountStart) totalPrice - standardDiscount
    else totalPrice

    val totalResult = if (monthlyBuyer) result * monthlyDiscount else result

    println("Итого: $totalResult")
}