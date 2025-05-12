class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val categories = clothes.map{ it[1] }.toSet()
            .map{ category -> clothes.count{ it[1] == category } }
        var answer = 1
        categories.forEach{
            answer *= it+1
        }
    
        return answer-1
    }
}