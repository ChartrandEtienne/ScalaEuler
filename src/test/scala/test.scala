package com.euler.test


import org.scalatest.FunSuite
import com.euler.fibonacci
import com.euler.facto
import com.euler.lcm
import com.euler.diff

class TestFib extends FunSuite {
	test("la suite est valide") {
		val x = new fibonacci()
//		assert(x.suite(5) == List(1, 1, 2, 3, 5))
//		assert(x.totalPair(6) == 10)
		val y = new facto()
//		assert(y.listePremiers2(20) == List(19, 17, 13, 11, 7, 5, 3, 2))
//		println(y.factorisation(90))
//		assert(y.factorisation(5236241) == List(31, 53, 3187))
//		assert(y.factorisation(90) == List(2, 3, 3, 5))
		val z = new lcm()
		assert((z.lcmList((1 to 10).toList)) == 2520)
		val a = new diff()
//		assert(a.squareSum(10) == 3025)
//		assert(a.sumSquare(10) == 385)
//		assert(a.difference(10) == 2640)
		assert(y.listePremiers(10001) == 2)
	}
}

