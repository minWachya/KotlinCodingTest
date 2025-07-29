import java.util.*

class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val q1 = LinkedList<Long>()
        val q2 = LinkedList<Long>()
        for(i in queue1.lastIndex downTo 0){ q1.push(queue1[i].toLong()) }
        for(i in queue2.lastIndex downTo 0){ q2.push(queue2[i].toLong()) }
        
        var sum1 = q1.sum()
        var sum2 = q2.sum()
        val sum = (sum1 + sum2) / 2
        val max = q1.size * 3

        var count = 0
        while(count < max) {
            if(sum1 == sum) return count
            
            if(sum1 > sum2) {
                val item = q1.pop()
                q2.offer(item)
                sum1 -= item
                sum2 += item
            }
            else {
                val item = q2.pop()
                q1.offer(item)
                sum2 -= item
                sum1 += item
            }
            
            count++
        }
 
        return -1
    }
}