package at.rocboron.euler.question8

import kotlin.math.max

/** Largest product in a series
 *
 * The four adjacent digits in the 1000-digit number
 * that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 *
 * 73167176531330624919225119674426574742355349194934
 * 96983520312774506326239578318016984801869478851843
 * 85861560789112949495459501737958331952853208805511
 * 12540698747158523863050715693290963295227443043557
 * 66896648950445244523161731856403098711121722383113
 * 62229893423380308135336276614282806444486645238749
 * 30358907296290491560440772390713810515859307960866
 * 70172427121883998797908792274921901699720888093776
 * 65727333001053367881220235421809751254540594752243
 * 52584907711670556013604839586446706324415722155397
 * 53697817977846174064955149290862569321978468622482
 * 83972241375657056057490261407972968652414535100474
 * 82166370484403199890008895243450658541227588666881
 * 16427171479924442928230863465674813919123162824586
 * 17866458359124566529476545682848912883142607690042
 * 24219022671055626321111109370544217506941658960408
 * 07198403850962455444362981230987879927244284909188
 * 84580156166097919133875499200524063689912560717606
 * 05886116467109405077541002256983155200055935729725
 * 71636269561882670428252483600823257530420752963450
 *
 * Find the thirteen adjacent digits in the 1000-digit number
 * that have the greatest product. What is the value of this product?
 */
class Problem8(private val adjacentNumbers: Int) {

    val input = "" +
            "73167176531330624919225119674426574742355349194934\n" +
            "96983520312774506326239578318016984801869478851843\n" +
            "85861560789112949495459501737958331952853208805511\n" +
            "12540698747158523863050715693290963295227443043557\n" +
            "66896648950445244523161731856403098711121722383113\n" +
            "62229893423380308135336276614282806444486645238749\n" +
            "30358907296290491560440772390713810515859307960866\n" +
            "70172427121883998797908792274921901699720888093776\n" +
            "65727333001053367881220235421809751254540594752243\n" +
            "52584907711670556013604839586446706324415722155397\n" +
            "53697817977846174064955149290862569321978468622482\n" +
            "83972241375657056057490261407972968652414535100474\n" +
            "82166370484403199890008895243450658541227588666881\n" +
            "16427171479924442928230863465674813919123162824586\n" +
            "17866458359124566529476545682848912883142607690042\n" +
            "24219022671055626321111109370544217506941658960408\n" +
            "07198403850962455444362981230987879927244284909188\n" +
            "84580156166097919133875499200524063689912560717606\n" +
            "05886116467109405077541002256983155200055935729725\n" +
            "71636269561882670428252483600823257530420752963450"

    fun run(): Long {
        return findLargestProduct(input)
    }

    fun findLargestProduct(number: String): Long {
        val horizontalStrips = number.split("\n")
        val verticalStrips = getVerticalStrips(horizontalStrips)

        println("Analyze horizontal strips")
        val greatestHorizontalProduct = getGreatestProduct(horizontalStrips)
        println("Analyze vertical strips")
        val greatestVerticalProduct = getGreatestProduct(verticalStrips)

        return max(greatestHorizontalProduct, greatestVerticalProduct)
    }

    fun getGreatestProduct(strips: List<String>): Long {
        val stripLength = strips[0].length
        var greatestProduct = 0L

        for (stripIndex in 0 until strips.size) {
            println("Analyzing row $stripIndex")
            for (charIndex in 0..stripLength - adjacentNumbers) {
                val numbersInString = strips[stripIndex].substring(charIndex, charIndex + adjacentNumbers)
                val numbersInChars = numbersInString.toCharArray().map { Integer.parseInt(it.toString()).toLong() }

                val product = numbersInChars.reduce { acc, it ->
                    //println("acc = $acc, it = $it")
                    if (it != 0L) {
                        acc * it
                    } else {
                        acc
                    }
                }

                if (product < 0) {
                    throw RuntimeException("This shouldn't happen")
                }

                if (product > greatestProduct) {
                    greatestProduct = product
                    println("New big! $numbersInChars product is $product")
                } else {
                    println("$numbersInChars product is too small")
                }
            }
        }
        return greatestProduct
    }

    private fun getVerticalStrips(horizontalStrips: List<String>): List<String> {
        val stripLength = horizontalStrips[0].length
        val horizontalStripsCount = horizontalStrips.size

        val verticalStrips = ArrayList<String>()
        for (charIndex in 0 until stripLength) {
            val sb = StringBuilder()
            for (stripIndex in 0 until horizontalStripsCount) {
                sb.append(horizontalStrips[stripIndex][charIndex])
            }
            verticalStrips.add(sb.toString())
        }
        return verticalStrips
    }
}