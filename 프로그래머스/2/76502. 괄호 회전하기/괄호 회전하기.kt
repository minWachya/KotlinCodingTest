import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
        for(i in 0 until s.length) {
            var st= Stack<Char>()
            for(j in i until i+s.length) {
                val c = s[j%s.length]
                when(c) {
                    '[' -> st.push('[')
                    ']' -> if(st.isNotEmpty() && st.peek() == '[') st.pop() else st.push(']')
                    '(' -> st.push('(')
                    ')' -> if(st.isNotEmpty() && st.peek() == '(') st.pop() else st.push(')')
                    '{' -> st.push('{')
                    else -> if(st.isNotEmpty() && st.peek() == '{') st.pop() else st.push('}')
                }
            }
            
            if(st.isEmpty()) answer++
        }
        
        return answer
    }
}