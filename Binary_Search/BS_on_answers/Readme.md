## 1
**Finding Sqrt of a number using Binary Search**

Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).


<pre>
Input: N = 36
Output: 6
Explanation: Square root of 36 is 6. 
Input: N = 28
Output: 5
Explanation: Square root of 28 is approximately 5.292. So, the floor value will be 5. 
</pre>

**Constraints**:

<br><hr><br>


## 2
**Nth Root of a Number using Binary Search**

Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.


<pre>
Input: N = 3, M = 27
Output: 3
Explanation: The cube root of 27 is equal to 3.
Input : N = 4, M = 69
Output: -1
Explanation : The 4th root of 69 does not exist. So, the answer is -1.
</pre>

**Constraints**:

<br><hr><br>

## 3
**Koko Eating Bananas**

Problem Statement: A monkey Koko is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.

Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.

<pre>
Input: N = 4, a[] = {7, 15, 6, 3}, h = 8
Output: 5
Explanation:  If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly. So, he will take 8 hours to complete all the piles.

Input: N = 5, a[] = {25, 12, 8, 14, 19}, h = 5
Output: 25
Explanation: If Koko eats 25 bananas/hr, he will take 1, 1, 1, 1, and 1 hour to eat the piles accordingly.
</pre>

**Constraints**:

<br><hr><br>

## 4
**Minimum days to make M bouquets**

Problem Statement: You are given 'N’ roses and you are also given an array 'arr' where 'arr[i]' denotes that the 'ith' rose will bloom on the 'arr[i]th' day. You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet. Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. Return -1 if it is not possible.

<pre>
Example 1:
Input Format: N = 8, arr[] = {7, 7, 7, 7, 13, 11, 12, 7}, m = 2, k = 3
Result: 12
Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.

Example 2:
Input Format: N = 5, arr[] = {1, 10, 3, 10, 2}, m = 3, k = 2
Result: -1
Explanation: If we want to make 3 bouquets of 2 flowers each, we need at least 6 flowers. But we are given only 5 flowers, so, we cannot make the bouquets.
</pre>

**Constraints**:

<br><hr><br>

## 5
**Find the Smallest Divisor Given a Threshold**

Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.
<pre>
Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
</pre>

**Constraints**:
- 1 <= nums.length <= 5 * 104
- 1 <= nums[i] <= 106
- nums.length <= threshold <= 106

<br><hr><br>

# 6
**Capacity To Ship Packages Within D Days**

A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

<pre>
Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
Example 2:

Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4
Example 3:

Input: weights = [1,2,3,1,1], days = 4
Output: 3
Explanation:
1st day: 1
2nd day: 2
3rd day: 3
4th day: 1, 1
</pre>

**Constraints**:
- 1 <= days <= weights.length <= 5 * 104
- 1 <= weights[i] <= 500
<br><hr><br>

## 7
**Kth Missing Positive Number**

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

<pre>
Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
</pre>

**Constraints**:
- 1 <= arr.length <= 1000
- 1 <= arr[i] <= 1000
- 1 <= k <= 1000
- arr[i] < arr[j] for 1 <= i < j <= arr.length
<br><hr><br>