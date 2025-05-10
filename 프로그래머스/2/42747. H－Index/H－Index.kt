class Solution {
    fun solution(citations: IntArray): Int {
        // index       : 0 1 2 3 4
        // 인용 횟수(정렬): 6 5 3 1 0
        // index >= 인용 횟수인 순간이 H-Index
        val citationsSort = citations.sortedDescending()
        for (index in citationsSort.indices) {
            if (index >= citationsSort[index]) return index
        }
        return citationsSort.size
    }
}