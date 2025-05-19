class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        var answer = 0
        
        // 던전 탐험
        for (i in dungeons.indices) {
            // 탐험할 던전
            var dungeon = dungeons[i]
            // 던전이 탐험 가능하면 입장
            if (k >= dungeon[0]) {
                // 피로도 소모, 해당 던전 제외한 배열로 재탐색
                var temp = solution(
                    k - dungeon[1], 
                    dungeons.sliceArray(0..i-1) + 
                        dungeons.sliceArray(i+1..dungeons.lastIndex))
                // 이후 탐색한 결과와 이전에 탐색한 결과 중 큰 값 저장
                if (temp + 1 > answer) answer = temp + 1
                if (answer == dungeons.count()) return answer
            }
        }
        
        return answer
    }
}