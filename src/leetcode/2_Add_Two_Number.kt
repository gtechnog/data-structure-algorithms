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

        var resultList : ListNode? = null
        var moveResultList : ListNode? = resultList

        var moveList1 = list1
        var moveList2 = list2

        var carry = 0
        while (moveList1 != null && moveList2 != null) {
            val sum = moveList1.`val` + moveList2.`val` + carry
            carry = sum / 10
            val nodeValue = sum % 10
            val newNode = ListNode(nodeValue)

            if (resultList == null) {
                resultList = newNode
                moveResultList = newNode
            } else {
                moveResultList?.next = newNode
                moveResultList = newNode
            }

            moveList1 = moveList1.next
            moveList2 = moveList2.next
        }

        // List1 might be completed
        if (moveList1 == null) {
            while (moveList2 != null) {
                val sum = moveList2.`val` + carry
                carry = sum / 10
                val nodeValue = sum % 10
                val newNode = ListNode(nodeValue)
                moveResultList?.next = newNode
                moveResultList = newNode
                moveList2 = moveList2.next
            }
        }

        // List2 might be completed
        if (moveList2 == null) {
            while (moveList1 != null) {
                val sum = moveList1.`val` + carry
                carry = sum / 10
                val nodeValue = sum % 10
                val newNode = ListNode(nodeValue)
                moveResultList?.next = newNode
                moveResultList = newNode
                moveList1 = moveList1.next
            }
        }

        // Still carry might be left
        if (carry != 0) {
            val newNode = ListNode(carry)
            moveResultList?.next = newNode
            moveResultList = newNode
        }

        return resultList
    }
}

class ListNode(var `val` : Int) {
    var next: ListNode? = null
}

fun main() {

}