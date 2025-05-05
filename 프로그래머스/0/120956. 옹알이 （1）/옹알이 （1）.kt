class Solution {
    fun solution(babbling: Array<String>): Int = babbling
        .filter{
            it.replace("aya|ye|woo|ma".toRegex(), " ")
            .trim()
            .length == 0
        }
        .count()
}