Approach :
To traverse,BT in ZigZag manner,use bfs approach store the elements in deque(can acess both front and back)
And flag to indicate left to right and right to left ..and deque from last for right
deque from front for left ..currentnode(Treenode)
Store ans in ArrayList and return ..operation are done in LinkedList

Complexity
Time complexity:
The time complexity of this solution is O(N), where N is the number of nodes in the binary tree, since we need to traverse all the nodes.

Space complexity:
The space complexity of this solution is O(N), since we need to store all the nodes in the queue.​

Edge case:

if the root is null return result || It is not statisfy tree properties (no need for reverse )
