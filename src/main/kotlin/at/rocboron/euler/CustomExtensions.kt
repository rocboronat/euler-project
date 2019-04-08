package at.rocboron.euler

import kotlin.math.pow

fun Number.pow(exponent: Int): Long {
    return toDouble().pow(exponent).toLong()
}