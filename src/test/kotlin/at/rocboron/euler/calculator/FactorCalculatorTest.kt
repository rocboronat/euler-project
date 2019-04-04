package at.rocboron.euler.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FactorCalculatorTest {

    @Test
    fun `2 is factor of 4`() {
        isFactorOf(2, 4)
    }

    @Test
    fun `3 is factor of 4`() {
        isNotFactorOf(3, 4)
    }

    @Test
    fun `3 is factor of 5`() {
        isNotFactorOf(3, 5)
    }

    @Test
    fun `3 is factor of 6`() {
        isFactorOf(3, 6)
    }

    @Test
    fun `5 is factor of 1000000`() {
        isFactorOf(5, 1000000)
    }

    private fun isFactorOf(value: Long, factorOf: Long) {
        assertThat(factor(value, factorOf)).isTrue()
    }

    private fun isNotFactorOf(value: Long, factorOf: Long) {
        assertThat(factor(value, factorOf)).isFalse()
    }

    private fun factor(value: Long, factorOf: Long) = FactorCalculator().isFactorOf(factorOf, value)
}