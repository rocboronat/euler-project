package at.rocboron.euler.question10

import at.rocboron.euler.calculator.extension.isPrime

/** Summation of primes
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
class Problem10(val below: Long) {

    fun run(): Long {
        return (1..below)
            .filter { it.isPrime() }
            .sum()
    }
}