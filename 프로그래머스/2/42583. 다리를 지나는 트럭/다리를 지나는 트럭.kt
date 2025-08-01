import java.util.*

class Solution {
    fun solution(
        bridge_length: Int,
        weight: Int,
        truck_weights: IntArray)
    : Int {
        var answer = 0
        var moveQueue = LinkedList<Int>()
        var waitQueue = LinkedList<Int>()
        truck_weights.forEach { waitQueue.offer(it) }
        
        val arrivalTruck = mutableListOf<Int>()

        while (arrivalTruck.size != truck_weights.size) {
            var sum = moveQueue.sum()
            var peekWeight = waitQueue.peek() ?: 0

            if (moveQueue.size == bridge_length){
                peekWeight -= moveQueue.peek()
            }
            
            if (moveQueue.size <= bridge_length && sum + peekWeight < weight+1) {
                moveQueue.offer(waitQueue.poll() ?: 0)
                answer++
            } else {
                moveQueue.offer(0)
                answer++
            }
            
            if (moveQueue.size > bridge_length) {
                if (moveQueue.peek() == 0) {
                    moveQueue.poll()
                } else {
                    arrivalTruck.add(moveQueue.poll())
                }
            }

        }
        return answer
    }
}