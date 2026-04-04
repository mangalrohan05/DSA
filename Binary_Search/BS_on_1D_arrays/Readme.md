## 1
**Binary Search**

Problem statement: You are given a sorted array of integers and a target, your task is to search for the target in the given array. Assume the given array does not contain any duplicate numbers.


<br><hr><br>

## 2
**Implement Lower Bound**

Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

<pre>
What is lower bound?
The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.

The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
</pre>

<pre>
Example 1:
Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
Result: 1
Explanation: Index 1 is the smallest index such that arr[1] >= x.

Example 2:
Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
Result: 3
Explanation: Index 3 is the smallest index such that arr[3] >= x.
</pre>

**Constraints**:

<br><hr><br>

## 3
**Implement Upper Bound**

Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

>What is Upper Bound?
The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than the given key i.e. x.
The upper bound is the smallest index, ind, where arr[ind] > x.


<pre>
Example 1:
Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
Result: 3
Explanation: Index 3 is the smallest index such that arr[3] > x.

Example 2:
Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
Result: 4
Explanation: Index 4 is the smallest index such that arr[4] 
</pre>

**Constraints**:

<br><hr><br>


## 4
**Search Insert Position**

Problem Statement: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

<pre>
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 
</pre>

**Constraints**:
- You must write an algorithm with O(log n) runtime complexity.
- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

<br><hr><br>


## 5
**Floor and Ceil in Sorted Array**

Problem Statement: ou're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1]. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x

<pre>
Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
Result: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
Result: 8 8
Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
</pre>

**Constraints**:

<br><hr><br>