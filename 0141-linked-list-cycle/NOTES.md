Intuition
1)In this question the given range is -10^5 <= Node.val <= 10^5. This can be used to mark any node as visited. 
2)That is after visiting any node change value of the node to something out of range. At any point if you feel value of node is outside the given range you can safely return true(this indicates start of cycle). When there is no cycle you will reach null anyway.

Approach(1 pointer):
i)Start traversing the given linked list.
ii)After reaching a particular node, change its value to 10^6(out of range).
iii)If at any point you reach a node whose value is 10^6(You came to node already visited by you), then return true.
iv)If at any point you reach null, then return false.

Complexity
Time complexity:
O(n)Traversing the whole linked list only once.
Space complexity:
O(1) No extra space is used​

Approach(2 Pointer):
1)Initialize two pointers fast and slow to the head of the linked list.
2)Iterate through the linked list with fast moving two steps at a time and slow moving one step at a time.
3)If fast and slow pointers meet at some point, there's a cycle in the linked list. Return true.
4)If fast reaches the end of the list (i.e., null), there's no cycle. Return false.

Complexity
Time complexity: O(n)
Space complexity: O(1)

Approach
Traverse the list and mar every visited node. If we reach a marked node, that means we already visited that node which means we have a cycle.
Traverse the list with recursion instead of a loop. Mark the value of the node with Integer.MAX_VALUE.

Complexity
Time complexity: O(n)
Space complexity: O(1)
