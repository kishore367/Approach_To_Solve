
Intuition
We are asked to reverse the linked list, we have to point every node to its previous node.Approach#1 ( Recursion )
Move to the next node till we reach the last node, now return this node to prev node, now change the returned node's next to prev node. and now return prev node and do this recursively.
Remeber to change the curr node's next to null, else you will end up in creating cycle.
Complexity
Time complexity: O(n)
Space complexity: O(n)

Approach#2 ( Two Pointer )
The idea is always make sure, you store previous node and change current node's next to previous node. and move to next node now since we are changing current node's next so first we will store current node's next node so that we don't lose the node and that's it.
Now at the end your previous node would be the head of the linked list.
Complexity
Time complexity: O(n)
Space complexity: O(n)​
