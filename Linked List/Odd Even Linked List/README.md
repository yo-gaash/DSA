# 328. Odd Even Linked List

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/odd-even-linked-list/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)

## Problem Statement

Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 
Example 1:

Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]


Example 2:

Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]


 
Constraints:


	The number of nodes in the linked list is in the range [0, 104].
	-106 <= Node.val <= 106

## Examples

```
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
```

## Constraints

- The number of nodes in the linked list is in the range [0, 104].
- -106 <= Node.val <= 106

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*