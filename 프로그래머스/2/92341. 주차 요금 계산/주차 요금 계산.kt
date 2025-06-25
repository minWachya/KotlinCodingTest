import java.util.*

class Solution {
    data class CarInfo(val carNum: String, var time: Int, var fee: Int)
    
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val cars = mutableListOf<CarInfo>()
        
        for(i in records.lastIndex downTo 0) {
            val carInfo = records[i].split(" ")
            val times = carInfo[0].split(":")
            val min = times[0].toInt() * 60 + times[1].toInt()
            
            // 기록 X
            if(cars.count{ it.carNum == carInfo[1] } == 0) {
                // in: 23:59 출차 가정
                if(carInfo[2].length == 2) {
                    val car = CarInfo(carInfo[1], 23*60 + 59 - min, 0)
                    cars.add(car)
                }
                // out: 나간 시간 저장
                else {
                    val car = CarInfo(carInfo[1], min, 0)
                    cars.add(car)
                }
            }
            // 기록 O
            else{
                // in: out - in
                if(carInfo[2].length == 2) {
                    cars.filter{ it.carNum == carInfo[1] }[0].run{
                        time = time - min
                    }
                }
                // out: in + out
                else {
                    cars.filter{ it.carNum == carInfo[1] }[0].run{
                        time = time + min
                    }
                }
            }
        }
        calculate(cars, fees)
        
        return cars.sortedBy{ it.carNum }.map{ it.fee }.toIntArray()
    }
    
    fun calculate(cars: List<CarInfo>, fees: IntArray) {
        cars.forEach{
            val parkingTime = it.time - fees[0]
            if(parkingTime > 0) {
                val newFee = fees[1] + ((parkingTime / fees[2]) + if(parkingTime % fees[2] == 0) 0 else 1 ) * fees[3]
                it.fee = newFee
            } else {
                it.fee = fees[1]
            }
        }
    }
}