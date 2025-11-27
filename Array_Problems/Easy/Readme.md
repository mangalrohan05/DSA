# Questions:

## 1
Problem Statement: Given an array, we have to find the largest element in the array.


<pre>
Example 1:  
Input: arr[] = {2, 5, 1, 3, 0}  
Output: 5  
Explanation:  
5 is the largest element in the array.

Example 2:  
Input: arr[] = {8, 10, 5, 7, 9}  
Output: 10  
Explanation:  
10 is the largest element in the array.
</pre>

<br><hr><br>

## 2
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist. Perform without **Sorting** array.


<pre>
Example 1:  
Input: [1, 2, 4, 7, 7, 5]  
Output:  
Second Smallest : 2  
Second Largest : 5  
Explanation:  The elements are sorted as 1, 2, 4, 5, 7, 7.  
Hence, the second smallest element is 2, and the second largest element is 5.

Example 2:  
Input: [1]  
Output:  
Second Smallest : -1  
Second Largest : -1  
Explanation:  Since there is only one element in the array, it is both the largest and smallest element.  
Therefore, there is no second smallest or second largest element present.
</pre>

<br><hr><br>

## 3
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.


<pre>
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.
Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.
Here element 5 is not smaller than or equal to its future elements.
</pre>

<br><hr><br>

## 4
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

<pre>
Input: arr[]=[1,1,2,2,2,3,3]
Output: [1,2,3,_,_,_,_]
Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
Output: [1,2,3,4,_,_,_,_,_,_,_]
Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
            
</pre>

<br><hr><br>

## 5
Problem Statement: Given an integer array nums, rotate the array to the left by one.

<pre>
Example 1:  
Input: nums = [1, 2, 3, 4, 5]  
Output: [2, 3, 4, 5, 1]  
Explanation: Initially, nums = [1, 2, 3, 4, 5]  
Rotating once to the left results in nums = [2, 3, 4, 5, 1].

Example 2:  
Input: nums = [-1, 0, 3, 6]  
Output: [0, 3, 6, -1]  
Explanation: Initially, nums = [-1, 0, 3, 6]  
Rotating once to the left results in nums = [0, 3, 6, -1].
</pre>

<br><hr><br>

## 6
Problem Statement: Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

<pre>
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>


<br><hr><br>

## 7
Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
<pre>
Input: {1, 0, 2, 3, 0, 4, 0, 1}
Output: {1, 2, 3, 4, 1, 0, 0, 0}
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Input : {1,2,0,1,0,4,0}
Output: {1,2,1,4,0,0,0}
Explanation : All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
</pre>

<br><hr><br>

## 8
Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.


<pre>
Example 1:  
Input: arr[] = 1 2 3 4 5, num = 3  
Output: 2  `
Explanation: 3 is present at the 2nd index of the array.

Example 2:  
Input: arr[] = 5 4 3 2 1, num = 5  
Output: 0  
Explanation: 5 is present at the 0th index of the array.
</pre>

<br><hr><br>

## 9
Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.


<pre>
Input:n = 5,m = 5 arr1[] = {1,2,3,4,5}  arr2[] = {2,3,4,4,5}
Output: {1,2,3,4,5}
Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}

Input:n = 10,m = 7,arr1[] = {1,2,3,4,5,6,7,8,9,10}arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation: Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}
</pre>

<br><hr><br>

## 10
Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array..


<pre>
Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.


Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.
</pre>

<br><hr><br>

## 11
Count Maximum Consecutive One's in the array

Given a binary array nums, return the maximum number of consecutive 1's in the array.


<pre>
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
</pre>

<br><hr><br>

## 12
Find the number that appears once, and the other numbers twice

Problem Statement: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
<pre>
Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
</pre>

<br><hr><br>

## 13
Longest Subarray with given Sum K(Positives)

Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
<pre>
Example 1:  
Input: nums = [10, 5, 2, 7, 1, 9], k = 15  
Output: 4  
Explanation: The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Example 2:  
Input: nums = [-3, 2, 1], k = 6  
Output: 0  
Explanation: There is no sub-array in the array that sums to 6. Therefore, the output is 0.
</pre>

<br><hr><br>

## 14
Longest Subarray with sum K | [Postives and Negatives]

Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

<pre>
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
Result: 3
Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.

</pre>

<br><hr><br>