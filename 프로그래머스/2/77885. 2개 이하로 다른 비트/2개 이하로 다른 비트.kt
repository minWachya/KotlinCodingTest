class Solution {
    fun solution(numbers: LongArray): LongArray = numbers
            .map{ n -> 
                if(n % 2 == 0L) n + 1 
                else n + ((n.inv()).takeLowestOneBit() shr 1)
            }
            .toLongArray()
}