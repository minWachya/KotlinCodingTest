class Solution {
    var zeroCount = 0
    var oneCount = 0
    
    fun solution(arr: Array<IntArray>): IntArray {
        find(arr, 0, arr.size, 0, arr.size)
        return intArrayOf(zeroCount, oneCount)
    }
    
    fun find(arr: Array<IntArray>, sx: Int, ex: Int, sy: Int, ey: Int) {
        var zero = 0
        var one = 0
        
        for(i in sx until ex) {
             for(j in sy until ey) {
                 if(arr[i][j] == 0) zero++
                 else one++
             }
         }
        
         if(zero == 0) {
             oneCount++
             return
         } else if(one == 0) {
             zeroCount++
             return
         }
         
         val mx = (ex - sx) / 2
         val my = (ey - sy) / 2
         for(i in 0 until 2) {
            for(j in 0 until 2) {
                find(arr, sx + (mx * i), sx + (mx * (i+1)), sy + (my * j), sy + (my * (j+1)))
            }
         } 
    }
}

         
