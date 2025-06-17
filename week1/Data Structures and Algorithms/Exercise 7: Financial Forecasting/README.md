Exercise 7: Financial Forecasting

Recursion is a technique where a function calls itself to solve smaller subproblems of the original problem.

When to Use Recursion:
   When a problem can be broken down into smaller, similar subproblems.
   Example: computing Fibonacci numbers, factorial, or navigating hierarchical data.

Time Complexity: O(n)
   For each year, one function call is made.
   So, when years = n, the function calls itself n times before hitting the base case (years == 0).
   No repeated work is done, just n recursive calls stacked one after another.
