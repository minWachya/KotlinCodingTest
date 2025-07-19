class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var temp = s
        
        if(temp.length == 1) return 1
        
        while(temp.length > 0) {
            val x = temp[0]
            var sameCount = 0
            var notSameCount = 0
            
            for(i in 0 until temp.length) {
                if(temp[i] == x) sameCount++
                else notSameCount++
                
                if(sameCount == notSameCount) {
                    answer++
                    temp = temp.slice(i+1 until temp.length)
                    break
                }
                if(sameCount + notSameCount == temp.length) return answer + 1
                if(i == temp.length - 1) {
                    temp = temp.slice(1 until temp.length)
                }
            }
            if(temp.length == 1){
                answer++
                break
            }
        }
        
        return answer
    }
}