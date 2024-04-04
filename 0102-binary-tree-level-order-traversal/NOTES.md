Intituion:
 In given Binary Tree ,We should traverse and get the order of elements level by level ....Here the clear intitution is to traverse level in order and returning the values of each level in a list of lists of integers.
 
Approach:
1) Here,i used Queue to traverse the tree in a level-by-level fashion(outer lists),while the inner lists are also represented as ArrayLists.
2)The difference between using LinkedList and ArrayList for the outer list in this code is related to their internal data structures and their performance characteristics.
3)makes it efficient to add or remove elements from the beginning or end of the list and ArrayList is implemented as a dynamic array, where elements are stored in a contiguous block of memory. This makes it efficient and return 

Complexity
Time complexity:O(n)
Space complexity:O(n)
 
 ​
