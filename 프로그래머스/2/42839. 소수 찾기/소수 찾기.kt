class Solution {
    private var numberSet = setOf<Int>()
    
    fun solution(numbers: String): Int {
        combine(numbers, "")
        return numberSet.count { checkPrime(it) }
    }
    
    fun combine(numbers: String, result: String) {
        if (result.length > 0) numberSet += result.toInt()
        if (numbers.length > 0){
            numbers.forEachIndexed { i, c ->
                combine(numbers.removeRange(i..i), c.plus(result))
            }
        }
    }
    
    fun checkPrime(n: Int): Boolean {
        if(n < 2) return false
        else {
            for(i in 2..n/2) {
                if(n % i == 0) return false
            }
        }
        return true
    }

}