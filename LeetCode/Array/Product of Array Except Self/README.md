# 238. Product of Array Except Self

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/product-of-array-except-self/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-eab308?style=flat-square)

## Problem Statement

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 
Constraints:


	2 <= nums.length <= 105
	-30 <= nums[i] <= 30
	The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.


 
Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

## Examples

```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

## Constraints

- 2 <= nums.length <= 105
- -30 <= nums[i] <= 30
- The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*