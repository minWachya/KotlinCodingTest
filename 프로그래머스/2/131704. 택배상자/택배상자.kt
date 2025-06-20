import java.util.*

class Solution {
    fun solution(order: IntArray): Int {
        val stk = Stack<Int>()
        var i = 0
        
        for(box in 1..order.size) {
            if(order[i] == box) i++
            else stk.push(box)
            
            if(stk.isNotEmpty() && stk.peek() == order[i]) {
                while(stk.isNotEmpty() && stk.peek() == order[i]) {
                    i++
                    stk.pop()
                }
            }
            
        }
        
        return i
    }
}