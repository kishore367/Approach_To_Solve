Intuition
To keep track of whether every opening bracket has a corresponding closing bracket, and vice versa, in the correct order, a stack data structure is an excellent choice. Stacks are commonly used for problems involving nested structures.

Approach
For this problem, we have two useful data structures that will making solving it easier. We can leverage a hash map (python dict) and a stack (really just a python list).

Hash Map:
1)The reason we use the hash map, or table, is because we want to be able to efficiently look up keys as well as retrieve their values in an efficient time (i.e. O(1)O(1)O(1)).
2)In our case, we will store the open parentheses as keys and the closed parentheses as the values. The reason why will make sense for the Overall Solution.

Stack:
1)The need for the stack is to make sure open parentheses gets closed by their corresponding closed parentheses. To make sure of this, we will only push open parentheses to the stack, but whenever we encounter a closed parenthesis, we'll check to make sure the current element on the top of the stack is the corresponding open parenthesis. Whenever it's not, we return False.
2)Since a stack is a Last In First Out (LIFO) data structure, the most recent open parenthesis will always be at the top of the stack which means whenever we encounter a closed parenthesis, its open parenthesis should be at the top of the stack if its a valid sequence of parenthesis.

Overall Solution
1)As for the entire solution, we will iterate through s and push open parentheses to the stack. Whenever we encounter a closed parenthesis, we pop from the stack and look up the open parenthesis in our hash map (mappings) to make sure its value corresponds to the current closed parenthesis we're iterating. 
2)If it does not, s does not have valid parentheses. Otherwsie, we continue on and if we successfuly close all open parentheses, our stack will be empty, so we return whether its empty or not.
Complexity
Time complexity: O(n)
Space complexity: O(1)
