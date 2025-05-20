class Solution {
    fun solution(s: String): IntArray {
        var answer = intArrayOf()
        var tuples = arrayOf<IntArray>()
        
        var tempArr = intArrayOf()
        var i = 0
        while(i < s.length) { 
            if(s[i] == '}') {
                tuples += tempArr
                tempArr = intArrayOf()
            }
            else if(s[i].isDigit()) {
                var tempNum = ""
                while(s[i].isDigit()) {
                    tempNum += s[i]
                    i++
                }
                i--
                tempArr += tempNum.toInt()
            }
            i++
        }
        
        
        tuples.sortedWith(compareBy({it.size})).forEach{
            for(c in it) {
                if(c !in answer) { 
                    answer += c
                    break
                }
            }
        }
        
        return answer
    }
}