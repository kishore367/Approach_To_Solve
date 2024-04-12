Let's redefine the problem:
So, the question says given the root of a binary tree, return the maximum depth of the tree. Max depth means the number of nodes along the longest path from root to farthest leaf node.

Recursion:
Lets have faith in recursion and assume that we are already given the maximum depth of root's left and right subtrees by recursion.
So to fnd the maximum depth of this binary tree, we will have to take out the maximum of the 2 depths given to us by recursion, and add 1 to that to consider the current level i.e. root's level into our depth.

Base Case:
We can easily analyse that if we are at a leaf node as root, then its left and right subtrees will have 0 depth, and consecutively, this leaf node will have max depth of 1.

Comlexity:
TC - O(num of nodes) as we are traversing all the nodes of the tree
SC - O(height of the tree) for the recursive stack​
