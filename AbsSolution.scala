package com.c5b8.scalacourse.exercises.class2

object AbsSolution {
	def abs(n: Double) = if (n >= 0) n else -n

	def main(args: Array[String]): Unit = {
		println(abs(4))
		println(abs(-123))
		println(abs(0))
	}
}
