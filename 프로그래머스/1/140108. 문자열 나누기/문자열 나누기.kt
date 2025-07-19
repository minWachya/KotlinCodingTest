import java.util.*

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        val q = LinkedList<Char>()
        
        s.forEach {
            if(q.isEmpty()) {
                answer++
                q.push(it)
            } else if(q.peek() == it) {
                q.push(it)
            } else q.pop()
        }
        
        return answer
    }
}