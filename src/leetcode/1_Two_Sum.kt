/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Detail Problem: https://leetcode.com/problems/two-sum/
 */
package leetcode

class Solution {
    fun twoSum(numbers: IntArray, target: Int) : IntArray {

        // This map will be used to store the occurrence of elements
        val dataMap = mutableMapOf<Int, Int>()

        // Iterate over the numbers
        for ((index, number) in numbers.withIndex()) {

            // If number is present in map already means we found both the element (current element & element present in map)
            if (dataMap.containsKey(target - number)) {
                return intArrayOf(index, dataMap.getValue(target-number))
            }

            // If number not present in map, add this element to map, might be useful for other elements
            dataMap[number] = index
        }

        // No combination found in the array, so returning empty array
        return intArrayOf()
    }
}

fun main() {
    println(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
}