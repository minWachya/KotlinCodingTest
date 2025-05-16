class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        var answer = 0
        
        for (i in dungeons.indices) {
            var dungeon = dungeons[i]
            if (k >= dungeon[0]) {
                var temp = solution(
                    k - dungeon[1], 
                    dungeons.sliceArray(0..i-1) + 
                        dungeons.sliceArray(i+1..dungeons.lastIndex))
                if (temp + 1 > answer) answer = temp + 1
                if (answer == dungeons.count()) return answer
            }
        }
        
        return answer
    }
}