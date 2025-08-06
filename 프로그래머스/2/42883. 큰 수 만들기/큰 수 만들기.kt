import java.util.*

class Solution {
    fun solution(number: String, k: Int): String {
        var answer = ""
        val stack = Stack<Char>()
        var restLength = k
        
        for(i in 0 until number.length) {
            val digit = number[i]
            while (!stack.isEmpty() && restLength > 0 && stack.peek() < digit) {
                stack.pop()
                restLength--
            }
            stack.push(digit)
        }
        
        while(!stack.isEmpty()) {
            answer += stack.pop()
        }
        
        return answer.reversed().substring(0, number.length-k);
    }
}