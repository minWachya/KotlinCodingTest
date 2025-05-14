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
                    else if(temp[i] < 100) break
                }
                answer += done
            }
            else {
                for(i in cur until temp.size){ temp[i] += speeds[i] }
            }
        }
        
        return answer
    }
}