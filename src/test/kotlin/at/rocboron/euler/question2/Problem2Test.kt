package at.rocboron.euler.question2

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem2Test {

    @Test
    fun run() {
        val value = Problem2().run()
        assertThat(value).isEqualTo(4613732)
    }
}