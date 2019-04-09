package at.rocboron.euler.question10

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem10Test {

    @Test
    fun checkGivenExample() {
        val value = Problem10(10).run()
        assertThat(value).isEqualTo(17)
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem10(2000000).run()
        assertThat(value).isEqualTo(142913828922)
    }
}