class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val correctNums = win_nums.count{ it in lottos }
        val max = 7 - (correctNums + lottos.count{ it == 0 })
        val min = 7 - correctNums
        
        return intArrayOf(if(max == 7) 6 else max, if(min == 7) 6 else min)
    }
}