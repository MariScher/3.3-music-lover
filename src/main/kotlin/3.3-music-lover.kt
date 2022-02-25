fun main() {
    val totalPrice = 15000.00
    val monthlyBuyer = true

    val standardDiscount = 100
    val increasedDiscount = 0.05
    val monthlyDiscount = 0.01
    val discountStart = 1001
    val discountRise = 10_001

    val result = if (totalPrice >= discountStart && totalPrice < discountRise) totalPrice - standardDiscount
    else if (totalPrice > discountRise) totalPrice - totalPrice * increasedDiscount else totalPrice

    val totalResult = if (monthlyBuyer) result - result * monthlyDiscount else result

    println("Итого: $totalResult")
}