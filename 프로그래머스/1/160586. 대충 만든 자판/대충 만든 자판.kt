class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
   
        targets.forEach{ target ->
            var count = 0
            var flag = true
            for(i in 0 until target.length){
                val orders = keymap
                    .map{ it.indexOf(target[i]) + 1 }
                    .filter{ it > 0 }
                    .sorted()
                if(orders.size == 0) {
                    answer += -1
                    flag = false
                    break
                } else count += orders[0]
            }
            if(flag) answer += count
        }
        
        return answer
    }
}