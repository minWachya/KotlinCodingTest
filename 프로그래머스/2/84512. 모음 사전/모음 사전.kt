class Solution {
    private val aeiouArr = arrayOf("A", "E", "I", "O", "U")
    private val result = mutableListOf<String>()

    fun solution(word: String): Int {
        dfs("")
        return result.indexOf(word)
    }

    fun dfs(str: String) {
        if(str.length > 5) return
        
        result.add(str)
        for(item in aeiouArr) {
            dfs(str + item)
        }
    }
}