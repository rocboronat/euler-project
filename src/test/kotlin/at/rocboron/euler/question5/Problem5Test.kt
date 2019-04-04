package at.rocboron.euler.question5

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem5Test {

    @Test
    fun checkGivenExample() {
        val value = Problem5(10).run()
        assertThat(value).isEqualTo(2520L)
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem5(20).run()
        assertThat(value).isEqualTo(232792560L)
    }
}