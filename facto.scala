package com.euler

import scala.Math

class facto {
	
	def trouver2(f: (Int, Int) => Int, liste: List[Int], n: Int): Int =
		if (liste.isEmpty) 0 else
		if (f(n, liste.head) != 0) f(n, liste.head) else
		trouver2(f, liste.tail, n)
	
	def mod(x: Int, y: Int): Int = if (x % y == 0) y else 0

	def trouverDiv2(liste: List[Int], n: Int): Int = 
		this.trouver2(this.mod, liste, n) 


	def listePremiers2(n: Int): List[Int] = {
		def suite(i: Int, max: Int, premiers: List[Int]): List[Int] = 
			if (i == max) premiers else
			if (this.trouverDiv2(premiers, i) != 0) suite(i + 1, max, premiers) else
			suite(i + 1, max, i :: premiers)
		suite(3, n, List(2))
	} 	

	def listePremiers(n: Int): List[Int] = {
		def suite(i: Int, nombre: Int, premiers: List[Int]): List[Int] = 
			if (nombre < 1) premiers else
			if (this.trouverDiv2(premiers, i) != 0) suite(i + 1, nombre, premiers) else suite(i + 1, nombre - 1, i :: premiers)
		suite(3, n - 1, List(2))
	}

	def factorisation(n: Int): List[Int] = {
		if (n < 2) Nil else
		if (n == 2) List(2) else
		if (n == 3) List(3) else {
			def suite(i: Int, premiers: List[Int]): List[Int] = 
				if (i == 1) Nil
				else if (premiers.isEmpty) List(i)
				else if (i % premiers.head == 0) premiers.head :: suite(i / premiers.head, premiers) 
				else suite(i, premiers.tail)	
			suite(n, this.listePremiers2(Math.sqrt(n).toInt + 1).reverse)
		}
	}
}
	
