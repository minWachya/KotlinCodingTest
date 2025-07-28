class Solution {
    fun solution(numbers: IntArray): String {
        val answer = numbers
            .map(Int::toString)
            .sortedWith{ a, b ->
                (b + a).compareTo(a + b)
            }
            .joinToString("")
        
        return if(answer[0] == '0') "0" else answer
    }
}