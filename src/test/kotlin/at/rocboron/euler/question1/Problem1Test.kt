package at.rocboron.euler.question1

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem1Test {

    @Test
    fun run() {
        val value = Problem1().run()
        assertThat(value).isEqualTo(233168)
    }
}