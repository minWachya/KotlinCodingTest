class Solution {
    private var numberSet = setOf<Int>()
    
    fun solution(numbers: String): Int {
        combinatorNumber(numbers, "")
        return numberSet.count { checkPrime(it) }
    }
    
    fun combinatorNumber(numbers: String, result: String) {
        if (result.isNotEmpty()) numberSet += result.toInt()
        if (numbers.isNotEmpty()){
            numbers.forEachIndexed { i, c ->
                combinatorNumber(numbers.removeRange(i..i), c.plus(result))
            }
        }
    }
    
    
    fun checkPrime(n: Int): Boolean {
        when (n) {
            0 -> return false
            1 -> return false
            2 -> return true
            else ->
                for (i in 2..(n/2)+1) {
                    if(n % i == 0) return false
                }
        }
        return true
    }

}