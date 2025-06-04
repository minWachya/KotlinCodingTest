data class Stage(val level: Int, val failRate: Double)

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {  
        var answer = arrayOf<Stage>()
        
        (1..N).forEach{ level -> 
            if(stages.count{ it >= level } == 0) {
                answer += Stage(level, 0.toDouble())
            }
            else {
                answer += Stage(level, stages.count{ it == level }.toDouble() / stages.count{ it >= level }.toDouble())
            }
        }
        return answer.sortedByDescending{ it.failRate }.map{ it.level }.toIntArray()
    }
}
