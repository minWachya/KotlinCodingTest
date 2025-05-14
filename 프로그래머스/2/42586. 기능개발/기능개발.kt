class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var temp = progresses
        
        var cur = 0
        while(cur < temp.size) {
            if(temp[cur] >= 100) {
                var done = 0
                for(i in cur until temp.size){
                    if(temp[i] >= 100) { 
                        done++
                        cur++
                    }
                    if(temp[i] < 100) break
                }
                answer += done
            }
            else {
                (0 until temp.size).forEach{
                    if(temp[it] < 100) temp[it] += speeds[it]
                }
            }
        }
        
        return answer
    }
}