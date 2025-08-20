class Solution {
    
    enum class Move(val x: Int, val y: Int) {
        BOTTOM(1, 0), RIGHT(0, 1), UP(-1, -1)
    }
    
    fun solution(n: Int): IntArray {
        var answer = Array(n) { Array<Int>(n) { 0 } }
        
        var round = n
        var num = 1
        var x = -1
        var y = 0
        var curMove = Move.BOTTOM
        while(round > 0) {
            when(curMove) {
                Move.BOTTOM -> {
                    repeat(round) {
                        x = x + Move.BOTTOM.x
                        y = y + Move.BOTTOM.y
                        answer[x][y] = num++
                    }
                    round--
                    curMove = Move.RIGHT
                }
                Move.RIGHT -> {
                    repeat(round) {
                        x = x + Move.RIGHT.x
                        y = y + Move.RIGHT.y
                        answer[x][y] = num++
                    }
                    round--
                    curMove = Move.UP
                }
                Move.UP -> {
                    repeat(round) {
                        x = x + Move.UP.x
                        y = y + Move.UP.y
                        answer[x][y] = num++
                    }
                    round--
                    curMove = Move.BOTTOM
                }
            }
        }
        
        return answer.flatten().filter{ it != 0 }.toIntArray()
    }
}