Intitution:
Swap the nodes from the given binary tree

Approach
In this question we have to Invert the binary tree.
So we use Post Order Treversal in which first we go in Left subtree 
Then in Right subtree then we return back to Parent node.
When we come back to the parent node we swap it's Left subtree and Right subtree.​

Complexity
Time complexity: O(N)
Space complexity: O(N) Recursive stack space
