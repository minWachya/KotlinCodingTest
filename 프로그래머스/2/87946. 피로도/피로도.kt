import kotlin.math.max

class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int = dfs(dungeons, BooleanArray(dungeons.size){false}, k, 0, 0)

    fun dfs(
        dungeons: Array<IntArray>,
        visited: BooleanArray,
        power: Int,
        maxCnt: Int,
        cnt: Int
    ) : Int {
        var tempMax = maxCnt
        
        for(i in dungeons.indices) {
            if(!visited[i] && power >= dungeons[i][0]){
                visited[i] = true
                tempMax = dfs(dungeons, visited, power-dungeons[i][1], tempMax, cnt+1)
                visited[i] = false
            }
        }
        return max(tempMax, cnt)
    }
}