class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray = 
    targets.map{ target ->
        target.map{ c -> keymap.map{ it.indexOf(c) + 1 }
                .filter{ it > 0 }
                .let{ list -> if(list.size == 0) -1 else list.minOf{ it } }
        }.let{ if(-1 in it) -1 else it.sum() }
    }.toIntArray()
}