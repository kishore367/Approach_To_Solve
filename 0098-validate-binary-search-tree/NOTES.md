Intuition
The intuition is that, every node should be range bound. We need to find the range and check of the node's val is falling in that range. If not, it is not BST, otherwise it is.

Solution:
Basically what I am doing is recursively iterating over the tree while defining interval <minVal, maxVal> for each node which value must fit in.
A range will be created for every node, and will check if the node's val is falling inside the associated range or not. 
if it exceed the limit then it is not a binary search tree.

Edge case:
There is a common way to handle comparison with Integer.MAX_VALUE and Integer.MIN_VALUE: use Long type as your left and right border.​
Complexity
Time complexity:
O(n)

Space complexity:
O(n)
