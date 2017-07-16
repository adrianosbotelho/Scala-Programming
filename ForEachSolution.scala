package com.c5b8.scalacourse.exercises.class4

object ForEachSolution {

	def foreach(a: List[Int], f: (Int) => Unit): Unit = for (i <- a) f(i)

	def main(args: Array[String]): Unit = {

	}
}
