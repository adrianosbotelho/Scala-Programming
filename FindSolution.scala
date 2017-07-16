package com.c5b8.scalacourse.exercises.class3

object FindSolution {

	def find(haystack: Array[Int], needle: Int, idx: Int = 0): Int =
		if (idx == haystack.length) -1
		else if (haystack(idx) == needle) idx else find(haystack, needle, idx + 1)


	def main(args: Array[String]): Unit = {
		println(find(Array(1, 22, 123, 53), 22))
		println(find(Array(1, 22, 123, 53), 11))
	}

}
