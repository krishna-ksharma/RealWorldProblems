package problems.leetcode.findTownJudge

fun main(args: Array<String>) {
    val trust = listOf(Pair(1, 3), Pair(1, 4), Pair(2, 3), Pair(2, 4), Pair(4, 3))
    val numberOfPeople = 4
    val findTownJudge = FindTownJudge()
    val judge = findTownJudge.findTownJudge(numberOfPeople, trust)
    println("Judge is $judge")
}

class FindTownJudge {
    fun findTownJudge(numberOfPeople: Int, trust: List<Pair<Int, Int>>): Int {
        val count = IntArray(numberOfPeople + 1)
        for (t in trust) {
            count[t.first]--
            count[t.second]++
        }
        for (i in 1..numberOfPeople) {
            if (count[i] == numberOfPeople - 1) {
                return i
            }
        }
        return -1
    }
}