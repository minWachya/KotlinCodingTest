class Solution {
    fun solution(n: Int): IntArray {
        val arr = Array(n){IntArray(n)}
        val dir = arrayOf(arrayOf(1,0),arrayOf(0,1),arrayOf(-1,-1))
        var moveMax = n
        var r=0
        var c=0
        var curDir = 0
        var num=1
        var moveCnt=0
        while(moveMax!=0){
            arr[r][c] = num++
            moveCnt++
            if(moveCnt==moveMax){
                moveMax--
                moveCnt=0
                curDir++
            }
            r+= dir[curDir%3][0]
            c+= dir[curDir%3][1]
        }
        
        val answer = ArrayList<Int>()
        
        for(i in 0 until n){
            for(j in 0 until n){
                if(arr[i][j]>0)
                    answer.add(arr[i][j])
            }
        }
        return answer.toIntArray()
    }
}