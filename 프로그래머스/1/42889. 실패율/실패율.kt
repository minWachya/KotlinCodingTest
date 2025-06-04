data class Stage(val level: Int, val fail: Int, val pass: Int) {
    val failRate: Float = if(pass == 0) 0f else (fail.toFloat()) / pass
}

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {  
        var answer = arrayOf<Stage>()
        
        (1..N).forEach{ level -> 
            answer += Stage(level,
                            stages.count{ it == level },
                            stages.count{ it >= level }
                           )
        }
        return answer
            .sortedByDescending{ it.failRate }
            .map{ it.level }
            .toIntArray()
    }
}