package at.rocboron.euler.question12

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem12Test {

    @Test
    fun checkGivenExample() {
        val value = Problem12(5).run()
        assertThat(value).isEqualTo(28)
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem12(500).run()
        assertThat(value).isEqualTo(70600674)
    }
}