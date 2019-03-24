package at.rocboron.euler.calculator

class PrimeCalculator {

    private val factor = FactorCalculator()

    fun isPrime(value: Long): Boolean {
        System.out.println("Is $value prime?")
        if (value < 2) {
            return false
        }
        for (i in 2 until value) {
            if (factor.isFactorOf(i, value)) {
                System.out.println("$value is not prime because $i is a divider")
                return false
            }
            if (i * i > value) {
                System.out.println("$value is prime because $i*$i is bigger than $value")
                return true
            }
        }
        System.out.println("$value is prime")
        return true
    }
}