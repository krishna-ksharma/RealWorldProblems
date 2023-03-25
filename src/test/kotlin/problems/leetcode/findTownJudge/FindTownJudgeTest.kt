package problems.leetcode.findTownJudge

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 *
 * If the town judge exists, then:
 *
 * a) The town judge trusts nobody.
 * b) Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 *
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 */
internal class FindTownJudgeTest {
    private val test: FindTownJudge = FindTownJudge()

    @Test
    fun `test 3 person labelled and town judge exists`() {
        val trust = listOf(Pair(1, 3), Pair(2, 3))
        val numberOfPeople = 3
        val result = test.findTownJudge(numberOfPeople, trust)
        assertEquals(result, 3)
    }

    @Test
    fun `test 4 person labelled and town judge exists`() {
        val trust = listOf(Pair(1, 3), Pair(1, 4), Pair(2, 3), Pair(2, 4), Pair(4, 3))
        val numberOfPeople = 4
        val result = test.findTownJudge(numberOfPeople, trust)
        assertEquals(result, 3)
    }

    @Test
    fun `test 3 person labelled and town judge doesn't exists`() {
        val trust = listOf(Pair(1, 3), Pair(2, 3), Pair(3, 1))
        val numberOfPeople = 3
        val result = test.findTownJudge(numberOfPeople, trust)
        assertEquals(result, -1)
    }

    @Test
    fun `given three person labelled, two pair of trust where town judge doesn't exists`() {
        val trust = listOf(Pair(1, 2), Pair(2, 3))
        val numberOfPeople = 3
        val result = test.findTownJudge(numberOfPeople, trust)
        assertEquals(result, -1)
    }
}