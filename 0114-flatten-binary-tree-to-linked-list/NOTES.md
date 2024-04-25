Intuition:
The key intuition of this solution is to preserve the "Pre-Order" order as we go.​

Approach:
Find current node's prenode that links to current node's right subtree
Use current node's left subtree to replace its right subtree(original right 
subtree is already linked by current node's prenode

Time Complexity: O(N) where N is the number of nodes in the binary tree
Space Complexity: O(1)
