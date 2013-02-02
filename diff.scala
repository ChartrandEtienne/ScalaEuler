package com.euler

class diff {
	def squareSum(n: Int): Int = (math.pow((n * (n + 1) / 2), 2)).toInt
	
	def sumSquare(n: Int): Int = (n * (n + 1) * (2 * n + 1) / 6).toInt

	def difference(n: Int): Int = squareSum(n) - sumSquare(n)
}

