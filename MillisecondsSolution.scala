package com.c5b8.scalacourse.exercises.class1


object MillisecondsSolution {

	def millisToString(t: Long): String = {
		var rest = t
		def aux(millisInUnit: Long): Long = if (rest >= millisInUnit) {
			val num = rest / millisInUnit
			rest %= millisInUnit
			num
		} else 0

		//ORDER IS IMPORTANT!!
		val days = aux(1000 * 60 * 60 * 24)
		val hours = aux(1000 * 60 * 60)
		val minutes = aux(1000 * 60)
		val seconds = aux(1000)
		s"$days day(s), $hours hour(s), $minutes minute(s), $seconds second(s)"
	}

	def main(args: Array[String]) {
		println(millisToString(60000 * 60 * 24 * 3 + 1000))
	}
}
