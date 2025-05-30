class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val babblingArr = arrayOf<String>("aya", "ye", "woo", "ma")
        
        for(word in babbling) {
            var temp = word
            
            for(b in babblingArr) {
                temp = temp.replace(b, "X")
                if(temp.contains("XX")) break
                else temp = temp.replace("X", " ")
            }
            temp = temp.replace(" ", "")
            if(temp.length == 0) answer++
        }
        
        return answer
    }
}