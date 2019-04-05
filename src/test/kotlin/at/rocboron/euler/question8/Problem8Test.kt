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
}