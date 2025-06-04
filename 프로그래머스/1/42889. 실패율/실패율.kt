class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()        
        val fail = (1..N).map{ stage -> 
            if(stages.count{ it >= stage } == 0) 0.toDouble()
            else stages.count{ it == stage }.toDouble() / stages.count{ it >= stage }.toDouble()
            }
        val sortFail = fail.toSet().sortedDescending()
        
        for(i in 0 until sortFail.size) {
            for(j in 0 until fail.size) {
                if(sortFail[i] == fail[j]) answer += j+1
            }
        }
        
        
        return answer
    }
}