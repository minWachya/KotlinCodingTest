class Solution {
    fun solution(answers: IntArray): IntArray {
        var answerCounts = intArrayOf()
        val students = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        
        for(i in students.indices) {
            answerCounts += answers.filterIndexed{ j, a -> 
                a == students[i][j % students[i].size] 
            }.count()
        }
        
        val maxCount = answerCounts.maxOf{it}
        return (1..3).filter{ answerCounts[it-1] == maxCount }.toIntArray()
    }
}