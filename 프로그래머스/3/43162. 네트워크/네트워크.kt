class Solution {
    var answer = 0
    
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val visited = BooleanArray(n) { false }
        for(i in 0 until n) {
            if(!visited[i]) {
                answer++
                dfs(n, computers, visited, i)
            }
            
        }
        
        return answer
    }
    
    fun dfs(n: Int, computers: Array<IntArray>, visited: BooleanArray, i: Int) {
        visited[i] = true
        
        for(j in 0 until n) {
            if(!visited[j] && computers[i][j] == 1) dfs(n, computers, visited, j)
        }
    }
}