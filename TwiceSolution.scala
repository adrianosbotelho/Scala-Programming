package com.c5b8.scalacourse.exercises.class4

object TwiceSolution {

	def twice(op: Double => Double, x: Double) = op(op(x))

	def main(args: Array[String]): Unit = {
		println(twice(2 * _, 10))
	}
}
