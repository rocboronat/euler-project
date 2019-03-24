package at.rocboron.euler.calculator

class PalindromicCalculator {
    fun isPalindromic(value: Long): Boolean {
        val stringValue = value.toString()

        val halfSize = stringValue.length / 2

        var position = 0
        while (position < halfSize) {
            if (stringValue[position] != stringValue[stringValue.length - 1 - position]) {
                return false
            }
            position++
        }

        return true
    }
}
