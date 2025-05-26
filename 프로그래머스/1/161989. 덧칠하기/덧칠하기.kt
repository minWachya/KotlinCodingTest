class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        
        var paint = 0
        for(i in section.indices) {
            if(section[i] > paint) {
                paint = section[i] + m - 1
                answer++
            }
        }
        
        
        return answer
    }
}