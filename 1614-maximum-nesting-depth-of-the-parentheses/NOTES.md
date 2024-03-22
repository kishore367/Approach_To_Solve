Intuition
We have to find the maximum depth of the parentheses. We can assume that when we get open bracket '(', then the depth increase and when we get close bracket ')', then the depth decrease.

Approach:
Step-1: Initialize curDepth and maxDepth from 0.
Step-2: Iterate over the string.
Step-3: If character is '(' then increase depth.
Step-4: If character is ')' then decrease depth.​
Complexity
Time complexity: O(N)
Space complexity: O(1)
