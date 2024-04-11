​Intituion:
We are given a perfect binary tree and we need to populate next pointers in each node of the tree.

Approach:
Here we should traverse in level order so ,wwe can go with BFS.
what they asking to connect level in order and return ..seems like linkedList 
Implementation like linkedlist ..check lestmost node is not null and connect (cuurentNode.left.next=currentNode.right)

TimeComplexity:
Runtime:O(n)
Space:O(1)//because we not store in queue or stack or ArrayList 

EdgeCase:
if root is null or not a prefect binary Tree
