/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Problem: https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
package leetcode

class AddTwoNumbers {

    fun addTwoNumbers(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        val resultList : ListNode? = null
        val currentPointerOnResult : ListNode? = null
        while (list1 != null && list2 != null) {
            val sum = list1.`val` + list2.`val`
            val newValue = sum % 10
            val carry = sum / 10

            val newNode = ListNode(newValue)
            currentPointerOnResult?.next = newNode ?: {
                resultList = newNode

            }

        }


    }
}

class ListNode(var `val` : Int) {
    var next: ListNode? = null
}