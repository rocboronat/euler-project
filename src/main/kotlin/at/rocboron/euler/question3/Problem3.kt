package at.rocboron.euler.question3

import at.rocboron.euler.calculator.FactorCalculator
import at.rocboron.euler.calculator.PrimeCalculator

/** Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
class Problem3 {

    companion object {
        val prime = PrimeCalculator()
        val factor = FactorCalculator()
    }

    fun run(): Long {
        return getLargestPrimeFactor(600851475143)
    }

    private fun getLargestPrimeFactor(value: Long): Long {
        val firstDivider = (2..value)
            .first { factor.isFactorOf(it, value) && prime.isPrime(value / it) }
        return value / firstDivider
    }
}