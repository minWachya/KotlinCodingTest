import java.util.*

class Solution {
    fun solution(operations: Array<String>): IntArray {
        val pqMin = PriorityQueue<Int>()
        val pqMax = PriorityQueue<Int>(Collections.reverseOrder())

        operations.forEach { operation ->
            val (a, b) = operation.split(" ")

            when (a) {
                "I" -> {
                    pqMin.offer(b.toInt())
                    pqMax.offer(b.toInt())
                }
                "D" -> {
                    if (b == "1") {
                        pqMax.poll()?.let { pqMin.remove(it) }
                    } else {
                        pqMin.poll()?.let { pqMax.remove(it) }
                    }
                }
            }
        }
        
        return if (pqMin.isNotEmpty() && pqMax.isNotEmpty()) intArrayOf(pqMax.peek(), pqMin.peek()) else intArrayOf(0, 0)
    }
}