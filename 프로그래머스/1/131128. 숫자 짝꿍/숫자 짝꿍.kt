class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""        
        var xArr = IntArray(10)
        var yArr = IntArray(10)  
        
        for (c in X) xArr[c.digitToInt()]++
        for (c in Y) yArr[c.digitToInt()]++
        
        for (i in 9 downTo 0) {
            if (xArr[i] != 0 && yArr[i] != 0) {
                var min = kotlin.math.min(xArr[i], yArr[i])
                answer += "$i".repeat(min)
            }
        }        
        if(answer.isEmpty()) return "-1"
        if(answer[0] == '0') return "0"       
        return answer
    }
}