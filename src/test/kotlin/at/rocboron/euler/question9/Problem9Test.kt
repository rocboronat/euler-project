package at.rocboron.euler.question9

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem9Test {

    @Test
    fun checkGivenExample() {
        val value = Problem9().isPythagoreanTriplet(3, 4, 5)
        assertThat(value).isTrue()
    }

    @Test
    fun checkBadExample() {
        val value = Problem9().isPythagoreanTriplet(3, 4, 6)
        assertThat(value).isFalse()
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem9().run()
        assertThat(value).isEqualTo(31875000)
    }
}