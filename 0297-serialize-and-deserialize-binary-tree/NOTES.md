Approach: 
Serialize function
Convert the values of all nodes to strings and push them in the pre-order traversal by recursive dfs function. Returns a string with values, separated by commas.

Deserialize function
Convert input data to array of strings by split method. Create the counter i and look up the array:

If value equals "null" returns null and increment the counter.
Else create the tree node, increment the counter and bind nodes in the pre-order traversal by recursive dfs function. Returns the created node.

Complexity
Time complexity: O(n)O(n)O(n)
Space complexity: O(n)O(n)O(n)​
