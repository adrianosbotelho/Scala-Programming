package com.c5b8.scalacourse.exercises.class1

object HanoiSolution {


	def moveDisks(n: Int, from: Int, to: Int, hanoi: Hanoi) {

		val other = 3 - from - to

		if (n == 1) {
			hanoi.moveDisk(from, to)
		} else {
			moveDisks(n - 1, from, other, hanoi)
			hanoi.moveDisk(from, to)
			moveDisks(n - 1, other, to, hanoi)
		}
	}

	def main(args: Array[String]) {
		val h = new Hanoi(7, 100)
		moveDisks(h.num, 0, 1, h)
		h.finished()
	}

}
