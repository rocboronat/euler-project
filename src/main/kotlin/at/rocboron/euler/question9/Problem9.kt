package at.rocboron.euler.question9

import at.rocboron.euler.ResultNotFoundException
import at.rocboron.euler.pow

/** Special Pythagorean triplet
 *
 * A Pythagorean triplet is a set of three natural numbers,
 * a < b < c, for which, a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
class Problem9 {

    fun run(): Int {
        val expectedValue = 1000
        for (a in 1..expectedValue) {
            for (b in 1..expectedValue) {
                for (c in 1..expectedValue) {
                    if (isPythagoreanTriplet(a, b, c)) {
                        if (a + b + c == expectedValue) {
                            return a * b * c
                        }
                    }
                }
            }
        }
        throw ResultNotFoundException()
    }

    fun isPythagoreanTriplet(a: Int, b: Int, c: Int): Boolean {
        return a.pow(2) + b.pow(2) == c.pow(2)
    }
}