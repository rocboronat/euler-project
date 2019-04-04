package at.rocboron.euler.calculator

class PrimeCalculator {

    private val factor = FactorCalculator()

    fun isPrime(value: Long): Boolean {
        if (value > 2 && factor.isFactorOf(value, 2)) {
            return false
        }

        if (value < 2) {
            return false
        }

        var i = 3L
        val square = Math.sqrt(value.toDouble()).toLong()
        while (i <= square) {
            if (factor.isFactorOf(value, i)) {
                return false
            }
            i += 2
        }
        return true
    }
}