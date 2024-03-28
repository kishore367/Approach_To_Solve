Intuition
Intuition is to search for the length of subarray which satisfy the given criteria and then maximize that length.
Since Frequencies are involved, use a map to keep a track of it.

Approach
Brute Force : (Will give TLE)
Using 2 for loops nested within, where we start from every index, find the length of max subarray possible from that index as per the criteria in ques, and return the maximum answer.
Complexity
Time complexity: O(N^2) Due to Nested for loops.
Space complexity: O(N)

Better Approach:
Binary Search: (Accepted)
Since the maximum length of the subarray will lie in between 0 to N only, we can perform Binary Search on answers to find this length.

Check function checks if the subarray of the given length is possible or not.
If possible, increment low to mid + 1 to find a better subarray.
If not possible, decrement high to mid-1 to find the possible subarray.
Time Complexity: O(NlogN)

Most Optimal Approach:
Sliding Window:
To avoid repeated calculation of same elements of a subarray in brute force, a sliding window with 2 pointers approach can be used to obtain a linear time solution.
Expand the window until the criteria is satisfied.
Shrink it till the time criteria is not satisfied.
Return the maximum length encountered.
Time Complexity : O(N)​
