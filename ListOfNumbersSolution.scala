package com.c5b8.scalacourse.exercises.class2


object ListOfNumbersSolution {

	def listNumbers(): Unit = for (i <- 1 to 100) print(s"""$i ${if (i % 5 == 0) "\n" else ""}""")

	def listNumbers2(): Unit = {
		for (i <- 0 until 20) {
			for (j <- 1 to 5) print((i * 5) + j + " ")
			println
		}
	}

	def main(args: Array[String]) {
		listNumbers()
	}
}
