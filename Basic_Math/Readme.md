# Problems:

## Q1

You are given an integer n. You need to return the number of digits in the number.



The number will have no leading zeroes, except when the number is 0 itself.

<pre>Input: n = 14

Output: 2

Explanation: There are 2 digits in 14.</pre>

## Q2
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.


<pre>
Input: n = 123

Output: 321

Explanation: Reverse of 123 is 321.
</pre>

## Q3
Given an integer x, return true if x is a palindrome, and false otherwise.

<pre> 
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
</pre>

## Q4
You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.



The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

<pre>Input: n1 = 4, n2 = 6

Output: 2

Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.</pre>

## Q5
Check if a number is Armstrong Number or not.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

<pre>
Example 1:
Input:N = 153

Output:True

Explanation: 13+73+33 = 1 + 125 + 27 = 153
                        
Example 2:
Input:N = 371                

Output: True

Explanation: 33+73+13 = 27 + 343 + 1 = 371
</pre>

## Q6
Print all Divisors of a given Number


Problem Statement: Given an integer N, return all divisors of N.
A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

<pre>Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.

Input: N = 12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
</pre>

## Q7
Check if a number is prime or not

Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

<pre>
Example 1:
Input:N = 2

Output:True

Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                        
Example 2:
Input:N =10                

Output: False

Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10. 
</pre>