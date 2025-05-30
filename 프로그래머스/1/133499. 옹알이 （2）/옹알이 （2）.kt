class Solution {
    fun solution(babbling: Array<String>): Int = babbling
            .map{ it.replace("ayaaya|yeye|woowoo|mama".toRegex(),"*") }
            .map{ it.replace("aya|ye|woo|ma".toRegex(), "") }
            .filter { it == "" }
            .size
}