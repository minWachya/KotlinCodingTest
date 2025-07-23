class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""        
        var setX = setOf<Char>()
        var setY = setOf<Char>()
        
        for (c in X) setX += c
        for (c in Y) setY += c
        
        val partnerSet = setX.intersect(setY).sortedDescending()
        partnerSet.forEach{ c ->
            val countX = X.count{ it == c }
            val countY = Y.count{ it == c }
            var min = kotlin.math.min(countX, countY)
            answer += "$c".repeat(min)
        }
      
        if(answer.isEmpty()) return "-1"
        if(answer[0] == '0') return "0"       
        return answer
    }
}