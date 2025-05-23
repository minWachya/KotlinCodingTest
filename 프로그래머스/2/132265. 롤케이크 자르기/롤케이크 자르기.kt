class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        
        val cakeA = IntArray(10_001) {0}
        val cakeB = IntArray(10_001) {0}
        
        var cakeASize = 0
        var cakeBSize = topping.toSet().size
        
        (topping.indices).forEach {
            cakeB[topping[it]]++
        }
        
        (topping.indices).forEach {
            cakeA[topping[it]]++
            if(cakeA[topping[it]] == 1) cakeASize++
            
            cakeB[topping[it]]--
            if(cakeB[topping[it]] == 0) cakeBSize--
            
            if(cakeASize == cakeBSize) answer++
        }
        
        return answer
    }
}