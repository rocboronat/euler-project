package at.rocboron.euler.question6

import kotlin.math.pow

/** Sum square difference
 *
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of
 * the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of
 * the first one hundred natural numbers and the square of the sum.
 */
class Problem6(val count: Long) {

    fun run(): Long {
        return squareOfTheSum() - sumOfTheSquares()
    }

    fun sumOfTheSquares(): Long {
        val squares = (1..count).map { it.toDouble().pow(2).toLong() }
        return squares.sum()
    }

    fun squareOfTheSum(): Long {
        val value = (1..count).sum()
        return value.toDouble().pow(2).toLong()
    }
}