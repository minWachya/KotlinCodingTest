class Solution {
    fun solution(numbers: IntArray, target: Int): Int = dfs(numbers, target, 0, 0)
    
    fun dfs(numbers: IntArray, target: Int, i: Int, sum: Int): Int {
        if(numbers.size == i) return if(sum == target) 1 else 0
        
        return dfs(numbers, target, i+1, sum+numbers[i]) + dfs(numbers, target, i+1, sum-numbers[i])
    }
}