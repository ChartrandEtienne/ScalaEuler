package com.euler
import scala.collection.mutable.Map

class lcm {
	// WHAT NOW BITCHES
	val fac = new facto()

	def factos(n: List[Int]): List[List[Int]] = 
		if (n.isEmpty) Nil else fac.factorisation(n.head) :: factos(n.tail)

	def indexMax(n: List[List[Int]]): Map[Int, Int] = 
		n.head.foldLeft(Map[Int, Int]()) {
			(m, x) => m + (x -> (1 + m.getOrElse(x, 0)))
		}

	def total(n: List[List[Int]]): Map[Int, Int] = {
		val listeMapsIndex = n.map{sousListe => {
			sousListe.foldLeft(Map[Int, Int]()) {
				(seed, n) => seed + (n -> (1 + seed.getOrElse(n, 0)))}
			}
		}
		listeMapsIndex.foldLeft(Map[Int, Int]()) {
			(seed, n) => {
				val k = seed.keysIterator.toSet union n.keysIterator.toSet
				k.foldLeft(Map[Int, Int]()) {
					(seed2, m) => seed2 + (m -> (if (seed.getOrElse(m, 0) > n.getOrElse(m, 0)) seed(m) else n(m)))}}}}
	
	// cette choses ici renvoie le plus petit multiple commun des nombres contenus dans cette liste. Probablement plein de bugs stupides relies a l'ordre des nombres dans la liste au d'autres stupidite du genre lcmList((1 to 10).toList) == 2520
	def lcmList(n: List[Int]): Int = {
		val inter = total(factos(n)) 
		inter.foldLeft(2){
			(seed, n) => seed * n._1 * n._2 }
	}
}


