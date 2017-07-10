/**
Project Euler #1: Multiples of 3 and 5
<p>
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000000000.
 */

class Euler001 {
    fun solution(_input: Long): Long {
        // input is immutable so
        val input = _input - 1
        val sum3 = 3 * (input / 3) * (input / 3 + 1) / 2
        val sum5 = 5 * (input / 5) * (input / 5 + 1) / 2
        val sum15 = 15 * (input / 15) * (input / 15 + 1) / 2
        return sum3 + sum5 - sum15
    }
}

fun main(args: Array<String>) {
    println(Euler001().solution(1_000_000_000));
}