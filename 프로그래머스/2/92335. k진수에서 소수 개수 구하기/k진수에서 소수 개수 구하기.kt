class Solution {
    fun solution(n: Int, k: Int): Int = n
        .toString(k)
        .split("0")
        .count{ it.isNotEmpty() && isPrime(it.toLong()) }
    
    fun isPrime(num : Long): Boolean = if (num <= 1) false else (2..Math.sqrt(num.toDouble()).toLong()).none { num % it == 0L }
    
}