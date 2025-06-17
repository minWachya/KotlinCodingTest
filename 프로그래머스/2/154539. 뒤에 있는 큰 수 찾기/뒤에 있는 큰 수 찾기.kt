import java.util.*

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size) { -1 }
        var stk = Stack<Int>()
        
        numbers.forEachIndexed{ i, num ->
            while(stk.isNotEmpty() && numbers[stk.peek()] < numbers[i]) {
                answer[stk.pop()] = numbers[i] 
            }
            stk.push(i)
        }
        
        return answer
    }
}