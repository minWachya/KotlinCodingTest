class Solution {
    private var answer = 0
    
    fun solution(word: String): Int {
        find("", word)
        return answer
    }

    fun find(s: String, word: String): Boolean {
        var str = s
        if(str == word) return true
        if(str.length >= 5) return false

        for (c in "AEIOU".toCharArray()) {
            str += c
            answer++
            if (find(str, word)) return true
            str = str.substring(0 until str.length-1)
        }
        return false
    }
}