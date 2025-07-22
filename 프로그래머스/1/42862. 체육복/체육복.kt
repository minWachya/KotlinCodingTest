class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        val lostList = lost.toMutableList()
        val reserveList = reserve.toMutableList()
        
        lost.forEach{
            if(it in reserveList) {
                lostList -= it
                reserveList -= it
            }
        }
        
        lostList.sorted().forEach{
            if(it-1 in reserveList) reserveList -= it-1
            else if(it+1 in reserveList) reserveList -= it+1
            else answer--
        }
        
        return answer
    }
}