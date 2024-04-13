Intuition
We can use BFS traversal and after processing a level we check whether we've seen any target (x or y) and if so we expect to have seen both to return True.

Approach:

1)we wil split the questions  1.To Findnode() 2.check isSibling()​ 3.level()
2)FindNode -traverse from left and check given x,y node is there or not
3)check the given node should not be sibling ..if sibling return false
4)and check the level of the node and return it.

Complexity
Time complexity:
BFS only to the level of the first target found (since we return after processing the first level on which there is a target). In the worst case we process every node so O(n) time where n is number of nodes

Space complexity:
BFS in worst case will iterate through entire tree level by level so q will take space of the max level which in the worst case will be n/2 so O(n) space

Edge case: root is null (return false)
