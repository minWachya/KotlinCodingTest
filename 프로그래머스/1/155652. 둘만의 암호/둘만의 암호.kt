class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val skipArr = skip.toCharArray()
        val alphabetArr = ('a'..'z').filter{ it !in skipArr }
        
        s.forEach{
            val i = (alphabetArr.indexOf(it) + index) % alphabetArr.size
            answer += alphabetArr[i]
        }
        
        return answer
    }
}