package at.rocboron.euler.question6

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem6Test {

    @Test
    fun checkGivenExample_finalAnswer() {
        val value = Problem6(10).run()
        assertThat(value).isEqualTo(2640)
    }

    @Test
    fun checkGivenExample_sumOfSquares() {
        val value = Problem6(10).sumOfTheSquares()
        assertThat(value).isEqualTo(385)
    }

    @Test
    fun checkGivenExample_squareOfTheSum() {
        val value = Problem6(10).squareOfTheSum()
        assertThat(value).isEqualTo(3025)
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem6(100).run()
        assertThat(value).isEqualTo(25164150)
    }
}