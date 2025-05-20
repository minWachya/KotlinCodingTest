class Solution {
    fun solution(s: String): IntArray = s.substring(2..s.lastIndex-2)
        .split("},{")
        .asSequence()
        .map{ it.split(",").map(String::toInt) }
        .sortedBy{ it.size }
        .fold(setOf<Int>()) { acc, list -> acc.union(list) }
        .toIntArray()
}