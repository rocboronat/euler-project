package at.rocboron.euler.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PrimeCalculatorTest {

    @Test
    fun `1 is not prime`() {
        isNotPrime(1)
    }

    @Test
    fun `2 is prime`() {
        isPrime(2)
    }

    @Test
    fun `3 is prime`() {
        isPrime(3)
    }

    @Test
    fun `4 is composite`() {
        isNotPrime(4)
    }

    @Test
    fun `5 is prime`() {
        isPrime(5)
    }

    @Test
    fun `6 is composite`() {
        isNotPrime(6)
    }

    @Test
    fun `7 is prime`() {
        isPrime(7)
    }

    @Test
    fun `8 is prime`() {
        isNotPrime(8)
    }

    @Test
    fun `12 is composite`() {
        isNotPrime(12)
    }

    @Test
    fun `14 is composite`() {
        isNotPrime(14)
    }

    @Test
    fun `15 is composite`() {
        isNotPrime(15)
    }

    @Test
    fun `17 is prime`() {
        isPrime(17)
    }

    @Test
    fun `105942 is composite`() {
        isNotPrime(105942)
    }

    @Test
    fun `105943 is prime`() {
        isPrime(105943)
    }

    @Test
    fun `300425737571 is composite`() {
        isNotPrime(300425737571)
    }

    @Test
    fun `100141912523 is prime`() {
        isPrime(100141912523)
    }

    private fun isPrime(value: Long) {
        assertThat(PrimeCalculator().isPrime(value)).isTrue()
    }

    private fun isNotPrime(value: Long) {
        assertThat(PrimeCalculator().isPrime(value)).isFalse()
    }
}