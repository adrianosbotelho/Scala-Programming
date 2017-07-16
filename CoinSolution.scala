package com.c5b8.scalacourse.exercises.class2

object CoinSolution {


	def coins(value: Double): String = {
		var rest = value

		def aux(coinValue: Double): Double = if (rest >= coinValue) {
			val num = (rest / coinValue).floor
			rest = rest - (num * coinValue)
			num
		} else 0

		val umReal = aux(1.0)
		val cinquentaCents = aux(0.5)
		val vinteCincoCents = aux(0.25)
		val dezCents = aux(0.10)
		val cincoCents = aux(0.05)
		val umCent = aux(0.01)

		s"$umReal moedas de 1 Real, $cinquentaCents moedas de 50 centavos, " +
				s"$vinteCincoCents moedas de 25 centavos, $dezCents moedas de 10 centavos," +
				s"$cincoCents moedas de 5 centavos, $umCent moedas de 1 centavo "
	}

	def main(args: Array[String]) {
		println(coins(1.32))
	}

}
