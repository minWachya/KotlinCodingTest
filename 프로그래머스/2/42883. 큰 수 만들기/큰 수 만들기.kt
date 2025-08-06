import java.util.*

class Solution {
    fun solution(number: String, k: Int): String {
        var answer = ""
        val stack = Stack<Char>()
        var rest = k
        
        for(n in number) {
            while (!stack.isEmpty() && rest > 0 && stack.peek() < n) {
                stack.pop()
                rest--
            }
            stack.push(n)
        }
        
        while(!stack.isEmpty()) {
            answer += stack.pop()
        }
        
        return answer.reversed().substring(0, number.length-k);
    }
}