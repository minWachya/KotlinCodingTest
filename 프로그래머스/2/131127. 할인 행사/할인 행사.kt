class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        
        for(i in 0..discount.size-10) {
            val discountTemp = discount.slice(i until i+10)
            val numberTemp = want
                .map{ w -> 
                    discountTemp.count{ it == w }
                }.toIntArray()
                
            if(numberTemp.contentEquals(number)) answer++
        }
        
        return answer
    }
}