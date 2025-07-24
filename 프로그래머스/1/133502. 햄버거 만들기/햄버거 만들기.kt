import java.util.Stack

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var stk = Stack<Int>()
        
        for(i in ingredient) {
            stk.push(i)
            
            if(i == 1 && stk.size >= 4) {
                val a = stk.pop()
                val b = stk.pop()
                val c = stk.pop()
                val d = stk.pop()
                if(a==1 && b==3 && c==2 && d==1) answer++
                else {
                    stk.push(d)
                    stk.push(c)
                    stk.push(b)
                    stk.push(a)
                }
            }
        }
        
        return answer
    }
}