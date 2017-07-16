package com.c5b8.scalacourse.exercises.class3

object PrimeSolution {

	def isPrime(n: Int): Boolean = {
		def loop(i: Int = 2): Boolean =
			if (i == n) true
			else (n % i > 0) && loop(i + 1)
		if (n == 1) true else loop()
	}

	def isPrime2(n: Int): Boolean = {
		def loop(i: Int = 2): Boolean = (i == n) || ((n % i > 0) && loop(i + 1))
		n == 1 || loop()
	}

	def allPrime(a: Array[Int]): Boolean = a.isEmpty || (isPrime(a.head) && allPrime(a.tail))

	def allPrime2(a: Array[Int]): Boolean = {

		def loop(idx: Int = 0): Boolean =
			if (idx == a.length) true
			else isPrime(a(idx)) && loop(idx + 1)

		loop()
	}

	def main(args: Array[String]): Unit = {
		println(allPrime(Array(1,2,4)))
		//		(1 to 20).foreach { i => println(i + " => " + (if (isPrime(i)) "primo" else "não primo")) }
//		(1 to 20).foreach { i => println(i + " => " + (if (isPrime2(i)) "primo" else "não primo")) }
	}
}
