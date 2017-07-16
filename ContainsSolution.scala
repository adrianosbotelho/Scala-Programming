package com.c5b8.scalacourse.exercises.class3


object ContainsSolution {

	def contains(haystack: Array[Int], needle: Int, idx: Int = 0): Boolean =
		if (idx == haystack.length) false
		else haystack(idx) == needle || contains(haystack, needle, idx + 1)

	def main(args: Array[String]): Unit = {
		println(contains(Array(1,22,123,53), 22))
		println(contains(Array(1,22,123,53), 11))
	}
}
