Intuition
To check if a binary tree is symmetric, we need to compare its left subtree and right subtree. To do this, we can traverse the tree recursively and compare the left and right subtrees at each level. If they are symmetric, we continue the traversal. Otherwise, we can immediately return false.

Approach:
 There is no need of checking root..so check it child
 From the child node ,we need to check symmetric or not
 The node of left.left == node right.right and same for left.right==right.left 
 if value is  equal return true or false
 
 Edge case;
 if root is null || child of root only one child node
  
Time complexity:The time complexity of the algorithm is O(n)
Space complexity:
The space complexity of the algorithm is O(h)​
