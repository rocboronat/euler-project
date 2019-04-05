package at.rocboron.euler.question7

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem7Test {

    @Test
    fun checkGivenExample() {
        val value = Problem7(6).run()
        assertThat(value).isEqualTo(13)
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem7(10001).run()
        assertThat(value).isEqualTo(104743)
    }
}