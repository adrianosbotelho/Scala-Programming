package com.c5b8.scalacourse.exercises.class3

object SortedSolution {

	def isSorted(a: Array[Int]): Boolean = {
		def aux(i: Int = 1): Boolean =
			if (i == a.length) true
			else (a(i) > a(i - 1)) && aux(i + 1)
		(a.length <= 1) || aux()
	}

	def isSorted2(a: Array[Int], i: Int = 1): Boolean =
		if (i >= a.length) true
		else (a(i) > a(i - 1)) && isSorted2(a, i + 1)

	def isSorted3(a: Array[Int], i: Int = 1): Boolean = (i >= a.length) || ((a(i) > a(i - 1)) && isSorted3(a, i + 1))

	def main(args: Array[String]): Unit = {
		println(isSorted3(Array(1, 2, 3)))
		println(isSorted3(Array(2, 3, 1)))
		println(isSorted3(Array(1,2)))
		println(isSorted3(Array(2,1)))
		println(isSorted3(Array(2)))
		println(isSorted3(Array()))
	}
}
