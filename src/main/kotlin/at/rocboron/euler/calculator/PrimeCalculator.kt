package at.rocboron.euler.calculator

class PrimeCalculator {

    private val factor = FactorCalculator()

    fun isPrime(value: Long): Boolean {
        System.out.println("Is $value prime?")
        if (value < 2) {
            return false
        }

        if (value > 2 && factor.isFactorOf(2, value)) {
            return false
        }

        var i = 3L
        val square = Math.sqrt(value.toDouble()).toLong()
        while (i < square) {
            if (factor.isFactorOf(i, value)) {
                System.out.println("$value is not prime because $i is a divider")
                return false
            }
            i += 2
        }
        System.out.println("$value is prime")
        return true
    }
}