package at.rocboron.euler.calculator

class FactorCalculator {
    fun isFactorOf(value: Long, factorOf: Long): Boolean {
        return value % factorOf == 0L
    }
}