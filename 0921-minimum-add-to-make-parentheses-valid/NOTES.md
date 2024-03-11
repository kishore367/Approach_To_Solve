Intuition
We can solve this problem using two approaches:

*)We can use a stack and solve it in O(N) time and O(N) space.
*)We can solve it without using stack (by using only variables) in O(N) time and O(1) space.
Approach 1:
1)Initialize an empty stack
2)Initialize a variable ans to 0. This variable will be used to store the number of additions needed to make the parentheses valid.
3)Iterate through each character of the input string s and check if the current character s[i] is an opening parenthesis '('.
4)If the current character is an opening parenthesis, push it onto the stack.
5)If the current character is not an opening parenthesis (it must be a closing parenthesis), check if the stack is not empty and the top element of the stack is an opening parenthesis. This means that a matching opening parenthesis is found for the current closing parenthesis.
6)If a matching opening parenthesis is found, pop the top element from the stack, indicating that these parentheses are matched.

Complexity
Time complexity: O(N)
Space complexity: O(N)

Approach 2:
1)Declare two variables, open and close, and initialize both of them to 0 to keep track of unmatched opening parentheses and unmatched closing parentheses, respectively.
2)Iterate through each character of a given string s and check if the current character s[i] is an opening parenthesis '('. If it is, then increment the open variable by 1.
3)If the current character is not an opening parenthesis, check if open is non-zero (meaning there are some unmatched opening parentheses). If open is non-zero, decrement the open variable by 1 (matching the current closing parenthesis with an opening parenthesis). Otherwise, if open is zero, it means there are no unmatched opening parentheses, so increment the close variable by 1 to keep track of unmatched closing parentheses.
4)After the for loop finishes executing, the open variable will represent the number of unmatched opening parentheses, and the close variable will represent the number of unmatched closing parentheses.
Finally, return the sum of the open and close variables, which gives us the total number of unmatched parentheses in the input string s.
Complexity
Time complexity: O(N)

Space complexity: O(1)
