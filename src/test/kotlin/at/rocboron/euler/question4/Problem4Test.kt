package at.rocboron.euler.question4

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem4Test {

    @Test
    fun run() {
        val value = Problem4().run()
        assertThat(value).isEqualTo(906609)
    }
}