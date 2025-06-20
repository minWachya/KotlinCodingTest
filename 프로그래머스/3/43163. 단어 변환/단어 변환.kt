class Solution {
    var answer = 51
    
    fun solution(begin: String, target: String, words: Array<String>): Int {
        val visited = BooleanArray(words.size){ false }
        find(visited, begin, target, 0, words)
        
        return if(answer == 51) 0 else answer
    }
    
    fun find(
        visited: BooleanArray, 
        begin: String, 
        target: String, 
        count: Int,
        words: Array<String>
    ) {
        for(i in 0 until visited.size) {
            if(!visited[i] && words[i].filterIndexed{ i, c -> begin[i] == c }.count() == begin.length-1) {
                visited[i] = true
                find(visited, words[i], target, count+1, words)
                visited[i] = false
            }
            if(begin == target && count < answer) answer = count
        }
    }
}