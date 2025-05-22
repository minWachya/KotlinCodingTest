import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = -1
        var queue: Queue<Int> = LinkedList()
        var queueIndex: Queue<Int> = LinkedList()
        for(i in 0 until priorities.size) {
            queue.offer(priorities[i])
            queueIndex.offer(i)
        }
        val sortPri = priorities.sortedDescending()
        var index = 0
        
        while(answer == -1) {
            var p = queue.poll()
            var pi = queueIndex.poll()
            
            if(p == sortPri[index]) {
                index++
                if(pi == location) answer = index
            }
            else {
                queue.offer(p)
                queueIndex.offer(pi)
            }
            
        }
        
        return answer
    }
}