package at.rocboron.euler.question5

import at.rocboron.euler.ResultNotFoundException
import at.rocboron.euler.calculator.extension.isFactorOf
import at.rocboron.euler.calculator.extension.isPrime

/** Smallest multiple
 *
 * 2520 is the smallest number that can be divided
 * by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 */
class Problem5(private val maxNumber: Long) {

    fun run(): Long {
        val primeNumbers = (1L..maxNumber)
            .filter { it.isPrime() }

        for (i in 1L..Long.MAX_VALUE) {
            val value = getNumberMultipliedBy(primeNumbers, i)
            if (isDivisibleByAllNumbersFrom1To(value, maxNumber)) {
                return value
            }
        }
        throw ResultNotFoundException()
    }

    private fun getNumberMultipliedBy(primeNumbers: List<Long>, multiplier: Long): Long {
        var result = 1L
        for (i in primeNumbers) {
            result *= i
        }

        return result * multiplier
    }

    private fun isDivisibleByAllNumbersFrom1To(value: Long, maxNumber: Long): Boolean {
        for (i in 1..maxNumber) {
            if (!value.isFactorOf(i)) {
                return false
            }
        }
        return true
    }
}