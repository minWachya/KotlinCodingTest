class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val scoreSortDes = score.sortedDescending()
        for(i in m-1 until scoreSortDes.size step m) {
            answer += scoreSortDes[i]
        }
        
        return answer * m
    }
}