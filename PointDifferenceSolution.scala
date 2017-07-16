package com.c5b8.scalacourse.exercises.class1

object PointDifferenceSolution {

	def pointDiff(p1: (Int, Int), p2: (Int, Int)) = (p1._1 - p2._1, p1._2 - p2._2)

	def main(args: Array[String]) {
		println(pointDiff((1, 2), (3, 4)))
	}
}
