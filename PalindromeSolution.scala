package com.c5b8.scalacourse.exercises.class1


object PalindromeSolution {
	def isPalindrome(s: String) : Boolean = if(s.length<=1) true else (s.head == s.last) && isPalindrome(s.tail.init)
	def main(args: Array[String]) {
		println(isPalindrome("bosta"))
	}
}
