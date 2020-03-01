/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Detail Problem: https://leetcode.com/problems/two-sum/
 */
package leetcode

class Solution {
    fun twoSum(numbers: IntArray, target: Int) : IntArray {
        val dataMap = mutableMapOf<Int, Int>()
        for ((index, number) in numbers.withIndex()) {
            if (dataMap.containsKey(target - number)) {
                return intArrayOf(index, dataMap.getValue(target-number))
            }
            dataMap[number] = index
        }
        return intArrayOf()
    }
}

fun main() {
    println(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
}