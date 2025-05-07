class Solution {
    fun solution(n: Int, left: Long, right: Long): List<Int> {
        val res = mutableListOf<Int>()
        for (i in left..right) {
            val x = (i % n).toInt()
            val y = (i / n).toInt()
            res.add(maxOf(x + 1, y + 1))
        }
        return res
    }
}