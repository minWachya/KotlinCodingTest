class Solution {
    fun solution(a: Int, b: Int): String {
        val month = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)	
		val days = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
		
		var sum = 0
		(0 until a-1).forEach {
			sum += month[it]
		}
		sum += b-1
        
        return days[sum%7]
    }
}