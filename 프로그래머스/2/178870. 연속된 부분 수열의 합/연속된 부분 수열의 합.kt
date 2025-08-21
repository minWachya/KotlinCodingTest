class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf(0, Int.MAX_VALUE)
        
        var left = 0
        var right = 0
        var sum = sequence[0]
        var max = sequence.size
        
        while(right < max) {
            if(sum < k) {
                if(right+1 == max) break
                sum += sequence[++right]
            }
            else {
                if(sum == k && answer[1] - answer[0] > right - left) {
                    answer[0] = left
                    answer[1] = right
                }
                sum -= sequence[left++]
            }
            
        }
        
        return answer
    }
}