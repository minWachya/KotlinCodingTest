class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var temp = ""
        
        picture.forEach { p ->
            for(i in 0 until p.length) {
                repeat(k) { temp += p[i] }
            }
            repeat(k) { answer += temp }
            temp = ""
        }
        
        return answer
    }
}