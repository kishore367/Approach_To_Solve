Intuition:
n this approach, first we check if the root node is either the p node or the q node. If it is then it is only the lowest common ancestor of the nodes.

Approach
Perform dfs and store path from root to target node for both the nodes p and q.
Then find first node from last in path of q which is also present in path of p.
return that node.

Complexity
Time complexity: O(n)
Space complexity:O(n)​
