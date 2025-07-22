class Solution {
    fun solution(record: Array<String>): Array<String> {
        val nicknameMap = mutableMapOf<String, String>()
        record.filter{it.split(" ").size > 2}.forEach{
            val str = it.split(" ")
            nicknameMap[str[1]] = str[2]
        }
        val messageMap = record
            .filter{ it.split(" ")[0] != "Change" }
            .map{
                nicknameMap[it.split(" ")[1]] + if(it.split(" ")[0] == "Enter") "님이 들어왔습니다." else "님이 나갔습니다."
            }.toTypedArray()
        
        return messageMap
    }
}