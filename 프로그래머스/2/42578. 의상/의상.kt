class Solution {
    fun solution(clothes: Array<Array<String>>): Int = clothes
        .groupBy{ it[1] }
        .values
        .fold(1) { acc, arr -> acc*(arr.size+1) } - 1
}