package com.c5b8.scalacourse.exercises.class1

object FibonacciSolution {

	def fib(n: Int): Long = {
		if (n == 0) 0
		else if (n == 1) 1
		else fib(n - 2) + fib(n - 1)
	}

	def main(args: Array[String]) {
		println((0 to 20).map(fib))
	}
}
