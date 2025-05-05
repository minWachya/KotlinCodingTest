class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        var answer: Int = 0
        var temp = num
        
        while (temp <= n) {
            temp += (w - ((temp - 1) % w) - 1) * 2 + 1
            println(temp)
            answer++
        }
        
        return answer
    }
}