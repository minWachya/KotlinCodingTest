import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val waitQueue = LinkedList<Int>(truck_weights.toList())
        val moveQueue = LinkedList<Int>(List(bridge_length) {0})
        
        while (moveQueue.isNotEmpty()) {
            answer++
            moveQueue.poll()
            
            if (waitQueue.isNotEmpty()) {
                if (moveQueue.sum() + waitQueue.peek() <= weight) {
                    moveQueue.add(waitQueue.poll())
                } else {
                    moveQueue.add(0)
                }
            }
        }
        return answer
    }
}