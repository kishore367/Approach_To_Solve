Intuition
1)The problem requires finding the middle node of a given singly-linked list. One approach to solving this problem is to iterate through the list to determine its length.
2)Then, we can traverse halfway through the list to find the middle node.

Approach(Brute Force):
Iterating through the loop the find the middle element

Complexity
Time complexity:
O(N+(N/2))
Space complexity:
O(N)

Approach(Recursion):
1)I employed a recursive approach to determine the length of a linked list. The findMiddleNode method within the Solution class recursively calls itself until the next node is null, signaling the end of the recursion.
2)To keep track of the node count, I initialized a variable named "total." As nodes with values are encountered during the recursion, the total variable is incremented by 1.
3)Subsequently, the calculateMiddleNode method is utilized to identify the exact middle node. Within this method, an 'i' variable is initialized to track the iteration count

Complexity
Time complexity:
O(N)
Space complexity:
O(1)

Approach(Slow & Fast):
1)We initialize two pointers, slowPointer and fastPointer, both starting from the head of the linked list. We then traverse the list with the fast pointer moving twice as fast as the slow pointer.
2)As long as the fast pointer and the node after it are not null, we move the slow pointer one step forward and the fast pointer two steps forward. When the fast pointer reaches the end of the list, the slow pointer will be at the middle.

Complexity
Time complexity:
O(N)
Space complexity:
O(1)
