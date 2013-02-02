package com.euler

class fizzBuzz {
	def print(n: Int) {
		var i: Int = 0
		while (i <= n) {
			if (i % 3 == 0 && i % 5 == 0) {
				println(i + ": FizzBuzz")
			} else if (i % 3 == 0) {
				println(i + ": Fizz")
			} else if (i % 5 == 0) {
				println(i + ": Buzz")
			}
			i += 1
		}
	}
}
