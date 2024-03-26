Approach(Brute force)
Creating new ArrayList and appending all node values into Array in an ordered fashion
Converting Array of Bits into Integer with simple Mathematical formula
Complexity
Time complexity:O(n)
Space complexity:O(kn)

Approach(Optimized)
This solution uses a direct approach of traversing the linked list and considering each node as a bit in the binary representation.
Beginning from the head, for each node, it multiplies the current value by 2 and adds the value of the next node. This process persists until the end of the list, resulting in the decimal equivalent.The solution then returns the final decimal equivalent obtained after traversing the entire linked list.
This direct approach allows for a simple and efficient conversion of a binary number represented as a linked list into its decimal equivalent.
Complexity
Time complexity:
O(n)
Space complexity:
O(1)​
