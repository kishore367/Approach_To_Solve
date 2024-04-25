Intuition
Go to every node and consider that this root with its maximum height left and right subtree is one of the candidates. Keep an ans variable to store the number of nodes in the longest path.

Approach:
 1. Calculate the diameter at each level node
 2.  By using height of the of tree save max diameter
 3. communicate with parent node​ and return max

Complexity
Time complexity:
O(n)
Space complexity:
O(1)
considering stack space : O(h), h is heights of the tree
