class Solution {
    data class Music(val num: Int, val plays: Int)

    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var answer = arrayListOf<Int>()
        val genresMap = mutableMapOf<String, ArrayList<Music>>()
        val genresPlaysCountMap = mutableMapOf<String, Int>()

         for (i in genres.indices) {
            val genre = genres[i]
            val playsCount = plays[i]

            if (genre !in genresMap.keys) {
                genresMap[genre] = arrayListOf(Music(i, playsCount))
                genresPlaysCountMap[genre] = playsCount
            } else {
                genresMap[genre]!!.add(Music(i, playsCount))
                genresPlaysCountMap[genre] = genresPlaysCountMap[genre]!! + playsCount
            }
        }

        val genreList = genresPlaysCountMap.toList()
                .sortedByDescending { it.second }
                .map { it.first }
        genreList.forEach { genre ->
            val musicList = genresMap[genre]!!
                .sortedWith(compareByDescending<Music> { it.plays }
                .thenBy { it.num })
            answer.add(musicList[0].num)
            if (1 < musicList.size) answer.add(musicList[1].num)
        }
        return answer.toIntArray()
    }
}