class Solution {
    private var answer = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        val visited = BooleanArray(dungeons.size) { false }
        findAnswer(k, dungeons, visited, 0)
        return answer
    }

    fun findAnswer(
        k: Int, 
        dungeons: Array<IntArray>, 
        visited: BooleanArray, 
        count: Int) {
        for (i in dungeons.indices) {
            // 방문한 적 없고 방문할 체력이 되면 ㄱㄱ
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true
                findAnswer(k - dungeons[i][1], dungeons, visited, count + 1)
                visited[i] = false
            }
        }

        if (count > answer) answer = count
    }
}