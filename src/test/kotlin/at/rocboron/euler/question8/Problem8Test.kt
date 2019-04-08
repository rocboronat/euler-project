package at.rocboron.euler.question8

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem8Test {

    @Test
    fun checkGivenExample() {
        val value = Problem8(4).run()
        assertThat(value).isEqualTo(5832)
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem8(13).run()
        assertThat(value).isEqualTo(2091059712)
    }

    @Test
    fun canUseFirstNumbersInTheStrip() {
        val list = listOf("9999999999999111")
        val value = Problem8(13).getGreatestProduct(list)
        assertThat(value).isEqualTo(2541865828329)
    }

    @Test
    fun canUseLastNumbersInTheStrip() {
        val list = listOf("1119999999999999")
        val value = Problem8(13).getGreatestProduct(list)
        assertThat(value).isEqualTo(2541865828329)
    }

    @Test
    fun canReadVerticalStrips() {
        val input = "6789\n6789\n6789"
        val value = Problem8(3).findLargestProduct(input)
        assertThat(value).isEqualTo(729)
    }
}