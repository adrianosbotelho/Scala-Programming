package com.c5b8.scalacourse.exercises.class2


object CompareSolution {

	def compare(n: Double): String = if (n > 0) "maior" else if (n < 0) "menor" else "igual"

	def compare2(n: Double): String = n match {
		case x if x > 0 => "maior"
		case x if x < 0 => "menor"
		case _ => "igual"
	}

	def main(args: Array[String]) {
		println(compare(0))
		println(compare(132))
		println(compare(-12))

		println(compare2(0))
		println(compare2(132))
		println(compare2(-12))

	}
}
