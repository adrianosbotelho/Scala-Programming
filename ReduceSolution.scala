package com.c5b8.scalacourse.exercises.class4

object ReduceSolution {

	def reduce[A, B](as: List[A], z: B)(f: (B, A) => B): B = {
		if (as.isEmpty) z
		else {
			var result = f(z, as.head)
			for (i <- as.tail) result = f(result, i)
			result
		}
	}

	def main(args: Array[String]): Unit = {

	}
}
