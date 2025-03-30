Java Algorithms and Recursion Problems
This project contains 10 Java programs implementing various algorithms and recursive functions. Below is a description of each problem, the approach used, and the time complexity analysis.


1. Find Minimum in an Array

Problem: Find the minimum element in an array.

Approach: Iterate through the array, keeping track of the minimum value.

Time Complexity: O(n)Space Complexity: O(1)


2. Compute Average of an Array

Problem: Compute the average of elements in an array.

Approach: Sum all elements and divide by the length.

Time Complexity: O(n)Space Complexity: O(1)


3. Prime Number Check

Problem: Determine if a given number is prime.

Approach: Iterate from 3 to sqrt(n), checking divisibility.

Time Complexity: O(√n)Space Complexity: O(1)


4. Factorial Calculation

Problem: Compute the factorial of n.

Approach: Use an iterative approach: fact = fact * i.

Time Complexity: O(n)Space Complexity: O(1)

Optimized Approach: Use recursion for a cleaner solution.

5. Fibonacci Sequence (Recursion)

Problem: Compute the nth Fibonacci number.

Approach: Use recursion: Fib(n) = Fib(n-1) + Fib(n-2).

Time Complexity: O(2^n) (exponential)Space Complexity: O(n) (recursion depth)

Optimized Approach: Use dynamic programming for O(n) time complexity.


6. Power Calculation

Problem: Compute n^m using iteration.

Approach: Multiply n by itself m times.

Time Complexity: O(m)Space Complexity: O(1)


7. Reverse an Array (Recursion)

Problem: Given an array, reverse it using recursion.

Approach: Swap the first and last elements recursively until the midpoint is reached.

Time Complexity: O(n)Space Complexity: O(n) (due to recursion stack)


8. Check If a String Contains Only Digits (Recursion)

Problem: Determine if a string consists of only digits.

Approach: Recursively check if the first character is a digit, then check the rest of the string.

Time Complexity: O(n)Space Complexity: O(n) (recursion depth)



9. Binomial Coefficient Calculation (Recursion)

Problem: Compute the binomial coefficient C(n, k).

Approach: Use the recursive relation C(n, k) = C(n-1, k-1) + C(n-1, k).

Time Complexity: O(2^n) (exponential)Space Complexity: O(n) (recursion depth)

Optimized Approach: Use dynamic programming for O(nk) time complexity.


10. GCD Using Recursion (Euclidean Algorithm)

Problem: Compute the Greatest Common Divisor (GCD) of two numbers.

Approach: Use the recursive Euclidean algorithm: GCD(a, b) = GCD(b, a % b).

Time Complexity: O(log(min(a, b)))Space Complexity: O(log(min(a, b)))



Optimized Approach: Use recursion for an alternative implementation.

How to Run the Programs

Compile the Java file using javac FileName.java.

Run the compiled class using java FileName.

Follow the input prompts.

