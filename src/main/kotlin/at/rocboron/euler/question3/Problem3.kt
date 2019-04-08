package at.rocboron.euler.question3

import at.rocboron.euler.calculator.extension.isFactorOf
import at.rocboron.euler.calculator.extension.isPrime

/** Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
class Problem3 {

    fun run(): Long {
        return getLargestPrimeFactor(600851475143)
    }

    private fun getLargestPrimeFactor(value: Long): Long {
        val firstDivider = (2..value)
            .first { value.isFactorOf(it) && (value / it).isPrime() }
        return value / firstDivider
    }
}