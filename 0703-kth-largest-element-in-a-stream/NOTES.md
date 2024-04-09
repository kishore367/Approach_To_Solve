Intuition
Use a min heap and maintain its size at k elements. By doing this we ensure that the root node of the heap is always the kth largest element.

Approach:
Add the new number to heap
If the size of the heap is disturbed pop a number out
Return the minimum of the k largest numbers in our heap(ie. the kth largest one)

Complexity
Time complexity: O((n+m)∗log(k)) where m is the number of calls to the add method
Space complexity: O(k)O(k)O(k)​
