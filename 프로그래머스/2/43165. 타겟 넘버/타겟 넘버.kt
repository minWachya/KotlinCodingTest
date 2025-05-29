class Solution {
    fun solution(numbers: IntArray, target: Int): Int = numbers
        .fold(listOf(0)) { list, num ->
            list.map { it + num } + list.map { it - num }
        }
        .count { it == target }
}