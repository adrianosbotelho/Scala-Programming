package com.c5b8.scalacourse.exercises.class2


object PrimeSolution {

	def isPrime(n: Int) : Boolean = {
		require(n > 0)
		var r = true
		if (n > 1)
			for (i <- 2 until n)
				if (n % i == 0) r = false
		r
	}

	def main(args: Array[String]) {
		println(isPrime(3))
		println(isPrime(5))
		println(isPrime(6))
		println(isPrime(13))
	}
}
