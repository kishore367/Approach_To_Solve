Intuition
We check for the adjecent pair of character needs to be removed so for that we have 2 approaches i) Brute Force ii) Stack iii)Two Pointer 

APPROACH 1(Brute Force):

 It uses a StringBuilder to efficiently manipulate the string and a while loop with a flag to control the iteration.
 
 Time complexity: O(N²)
 Space complexity: O(n)

 APPROACH 2(Stack):

1) Stack follows FILO so we can use that to iterate the whole string and check if stack is empty we simply push the element.
2)Then we compare the element inside the stack and check the condition if the stack is not empty then we just pop() that element from the stack.
3)In this way we will be left with the rest of the character that we need as our answer.

Complexity
Time complexity:
O(n)

Space complexity:
o(n)

APPROACH 3(Two-Pointers):
1)Initialize two pointers, i and j, both pointing to the first and second characters of the string s, respectively.

2)Use a while loop to iterate through the string while j is within the valid index range (0 to s.length() - 1).

3)Check if the characters at indices i and j are the same. If they are, it means we have found a duplicate pair.

Complexity
Time complexity:0(N*N)
Space complexity:0(1)

Atlast the Optimized is using Stack.

