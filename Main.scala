package com.euler

// src/test/scala/test.scala

object Main {
	def main(args: Array[String]) {
		// val w = new fizzBuzz()
		// w.print(100)
		val x = new fibonacci()
//		println("fib 5 = " + x.nieme(5))
		println("fib 10 = " + x.suite(5))
		val fac = new facto
		println(fac.listePremiers(200))
		println(fac.listePremiers(10001))
	}
}
