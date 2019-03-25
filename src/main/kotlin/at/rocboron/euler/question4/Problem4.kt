package at.rocboron.euler.question4

import at.rocboron.euler.calculator.PalindromicCalculator

/** Largest palindrome product
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4 {

    private val palindromic = PalindromicCalculator()

    fun run(): Long {
        val palindromics = ArrayList<Long>()
        val values = ArrayList<Long>()

        for (position in 999L downTo 1L) {
            values.add(position)
            for (value in values) {
                val result = value * position
                if (palindromic.isPalindromic(result)) {
                    palindromics.add(result)
                }
            }
        }
        return palindromics.max()!!
    }
}