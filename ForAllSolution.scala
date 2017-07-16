package com.c5b8.scalacourse.exercises.class4

object ForAllSolution {

	def forall[A](list: List[A],p: A => Boolean): Boolean = {
		var result = true
		for (i <- list) result &= p(i)
		result
	}

	def forall2[A](list: List[A], p: A => Boolean): Boolean =
		list.isEmpty || (p(list.head) && forall2(list.tail, p))

	def main(args: Array[String]): Unit = {

		println(forall(List(10, 20, 30), (a: Int) => a >= 10))
		println(forall(List(10, 20, 30), (a: Int) => a % 2 > 0))

	}
}
