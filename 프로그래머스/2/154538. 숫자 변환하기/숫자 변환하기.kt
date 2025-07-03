import java.util.*

data class NumInfo(var num: Int, var count: Int)

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val q = LinkedList<NumInfo>()
        val visited = BooleanArray(y+1) { false }
        
        q.push(NumInfo(x, 0))
        visited[x] = true
        
        while(q.isNotEmpty()) {
            val numInfo = q.poll()
            val num = numInfo.num
            val count = numInfo.count
            
            if(num == y) return count
            
            if(num+n <= y && !visited[num+n]) {
                q.offer(NumInfo(num+n, count+1))
                visited[num+n] = true
            }
            if(num*2 <= y && !visited[num*2]) {
                q.offer(NumInfo(num*2, count+1))
                visited[num*2] = true
            }
            if(num*3 <= y && !visited[num*3]) {
                q.offer(NumInfo(num*3, count+1))
                visited[num*3] = true
            }
        }
        
        return -1
    }
}