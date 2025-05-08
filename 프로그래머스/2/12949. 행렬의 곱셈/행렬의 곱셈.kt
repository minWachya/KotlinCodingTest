class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        
        for (i in 0 until arr1.size) {
            var temp = intArrayOf()
            for (j in 0 until arr2[0].size) {
                var sum = 0
                for (k in 0 until arr1[0].size) {
                    sum += arr1[i][k] * arr2[k][j]
                }
                temp += sum
            }
            answer += temp
        }
        
        return answer
    }
}