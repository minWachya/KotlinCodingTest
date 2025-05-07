class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray = (left..right)
        .map { maxOf(it%n, it/n).toInt() + 1 }
        .toIntArray()
}