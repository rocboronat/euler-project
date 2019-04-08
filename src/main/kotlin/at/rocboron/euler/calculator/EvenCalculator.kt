package at.rocboron.euler.calculator

class EvenCalculator {

    fun isEven(value: Number): Boolean {
        return value.toLong() % 2 == 0L
    }
}