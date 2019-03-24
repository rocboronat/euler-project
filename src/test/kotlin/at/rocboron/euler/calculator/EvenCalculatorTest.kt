package at.rocboron.euler.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class EvenCalculatorTest {

    @Test
    fun `1 is not even`() {
        isNotEven(1)
    }

    @Test
    fun `2 is even`() {
        isEven(2)
    }

    @Test
    fun `3 is not even`() {
        isNotEven(3)
    }

    @Test
    fun `4 is even`() {
        isEven(4)
    }

    private fun isEven(value: Long) {
        assertThat(even(value)).isTrue()
    }

    private fun isNotEven(value: Long) {
        assertThat(even(value)).isFalse()
    }

    private fun even(value: Long) = EvenCalculator().isEven(value)
}