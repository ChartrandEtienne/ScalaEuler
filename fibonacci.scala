package com.euler

class fibonacci {
	var cache: List[Int] = List(1, 1)
	def nieme(n: Int): Int =
		if (n <= 1) 1
		else if (n <= cache.length) cache(n)			
		else { 
			cache = nieme(n - 1) + nieme(n - 2) :: cache
			cache(n)
		}
	def suite(n: Int): List[Int] = 
		if (n <= 1) 1 :: Nil
		else if (n == 2) 1 :: 1 :: Nil
		else {
			def fib(i: Int, j: Int, k: Int): List[Int] = 
				if (i == 2) List(k)
				else k :: fib(i - 1, k, k + j)
			1 :: fib(n, 1, 1)
		}
	def totalPair(n: Int): Int = {
		def iter(a: List[Int]): Int = 
			if (a == Nil) 0
			else if (a.head % 2 == 0) a.head + iter(a.tail)
			else iter(a.tail)
		iter(this.suite(n))
	}
}

