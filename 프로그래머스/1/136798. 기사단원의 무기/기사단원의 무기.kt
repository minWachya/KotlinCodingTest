class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val numList = (1..number).map{ num -> 
            (1..num/2).count{ num % it == 0 } + 1
        }
        val limitNumList = numList.map{ if(it > limit) power else it }
        return limitNumList.sum()
    }
}