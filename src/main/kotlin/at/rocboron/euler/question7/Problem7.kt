package at.rocboron.euler.question7

import at.rocboron.euler.ResultNotFoundException
import at.rocboron.euler.calculator.extension.isPrime

/** 10001st prime
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 */
class Problem7(private val expectedPosition: Long) {

    fun run(): Long {
        var actualPosition = 1L
        for (value in 1..Long.MAX_VALUE) {
            if (value.isPrime()) {
                if (actualPosition == expectedPosition) {
                    return value
                }
                actualPosition++
            }
        }
        throw ResultNotFoundException()
    }
}