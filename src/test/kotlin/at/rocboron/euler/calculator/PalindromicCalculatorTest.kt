package at.rocboron.euler.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PalindromicCalculatorTest {

    @Test
    fun `1 is palindromic`() {
        isPalindromic(1)
    }

    @Test
    fun `11 is palindromic`() {
        isPalindromic(11)
    }

    @Test
    fun `121 is palindromic`() {
        isPalindromic(121)
    }

    @Test
    fun `1221 is palindromic`() {
        isPalindromic(1221)
    }

    @Test
    fun `12321 is palindromic`() {
        isPalindromic(12321)
    }

    @Test
    fun `1234567654321 is palindromic`() {
        isPalindromic(1234567654321)
    }

    @Test
    fun `12 is not palindromic`() {
        isNotPalindromic(12)
    }

    @Test
    fun `123 is not palindromic`() {
        isNotPalindromic(123)
    }

    @Test
    fun `1234 is not palindromic`() {
        isNotPalindromic(1234)
    }

    private fun isPalindromic(value: Long) {
        assertThat(PalindromicCalculator().isPalindromic(value)).isTrue()
    }

    private fun isNotPalindromic(value: Long) {
        assertThat(PalindromicCalculator().isPalindromic(value)).isFalse()
    }
}