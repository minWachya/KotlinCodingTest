class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        
        s.forEach{
            answer += newS(it, skip, index)
        }
        
        return answer
    }
    
    fun newS(s: Char, skip: String, index: Int): Char {
        var i = 0
        var newS = s
        while(i < index) {
            newS++
            if(newS.toInt() > 122) newS = 'a' + newS.toInt() - 123
            if(newS !in skip) i++
        }
        return newS
    }
}