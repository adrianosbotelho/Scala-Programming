package com.c5b8.scalacourse.exercises.class3

object FibonacciSolution {

	def fib(n: Int): Long = {

		@annotation.tailrec
		def loop(n: Int, prev: Long, cur: Long): Long =
			if (n == 0) prev
			else loop(n - 1, cur, prev + cur)

		loop(n, 0, 1)

	}

	def main(args: Array[String]): Unit = {

		// 0 1 1 2 3 5 8
		println(fib(6))
	}
}
