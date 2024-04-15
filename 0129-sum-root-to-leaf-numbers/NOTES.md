
Intituion:
We are given a binary tree consisting of nodes with digit values. We need to consider every possible root-to-leaf path. Each of these path represent a number. We need to return the total sum of all the number represented by each of these paths.
​Approach
for each node you traverse, add this digit to variable cur
and if you reach in leaf node, return the cur -> that the number of this path
Complexity
Time complexity: O(Number of Nodes)
Space complexity: O(Number of Nodes) -> auxiliary space from stack
 # Edge case check
        if not root:
            return 0
