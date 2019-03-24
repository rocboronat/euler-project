package at.rocboron.euler.question3

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Problem3Test {

    @Test
    fun run() {
        val value = Problem3().run()
        assertThat(value).isEqualTo(6857L)
    }
}