package at.rocboron.euler.question11

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem11Test {

    @Test
    fun parseHorizontalStrips() {
        val value = Problem11().getHorizontalStrips()
        assertThat(value[0][0]).isEqualTo(8)
        assertThat(value[0][1]).isEqualTo(2)
        assertThat(value[0][2]).isEqualTo(22)
    }

    @Test
    fun parseVerticalStrips() {
        val core = Problem11()
        val value = core.getVerticalStrips(core.getHorizontalStrips())
        assertThat(value[0][0]).isEqualTo(8)
        assertThat(value[0][1]).isEqualTo(49)
        assertThat(value[0][2]).isEqualTo(81)
    }

    @Test
    fun parseRotatedStrips() {
        val core = Problem11()
        val value = core.getRotatedStrips(core.getHorizontalStrips())
        assertThat(value[0][0]).isEqualTo(1)
        assertThat(value[0][1]).isEqualTo(20)
        assertThat(value[0][2]).isEqualTo(20)
    }

    @Test
    fun getSolutionOfTheExercise() {
        val value = Problem11().run()
        assertThat(value).isEqualTo(70600674)
    }
}