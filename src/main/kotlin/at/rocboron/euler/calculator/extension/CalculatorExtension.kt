package at.rocboron.euler.calculator.extension

import at.rocboron.euler.calculator.EvenCalculator
import at.rocboron.euler.calculator.FactorCalculator
import at.rocboron.euler.calculator.PalindromicCalculator
import at.rocboron.euler.calculator.PrimeCalculator

val evenCalculator = EvenCalculator()
val primeCalculator = PrimeCalculator()
val factorCalculator = FactorCalculator()
val palindromicCalculator = PalindromicCalculator()

fun Number.isEven(): Boolean {
    return evenCalculator.isEven(this.toLong())
}

fun Number.isPrime(): Boolean {
    return primeCalculator.isPrime(this.toLong())
}

fun Number.isFactorOf(it: Long): Boolean {
    return factorCalculator.isFactorOf(this.toLong(), it)
}

fun Number.isPalindromic(): Boolean {
    return palindromicCalculator.isPalindromic(this.toLong())
}