Intuition
To find the maximum length of a contiguous subarray with an equal number of 0s and 1s, we can use the concept of prefix sum. Whenever we encounter a 0, we decrement the sum by 1, and whenever we encounter a 1, we increment the sum by 1. If the prefix sum at two indices is the same, it means that the number of 0s and 1s between those two indices is the same. We store these prefix sums along with their indices in a hash map. Then, for each prefix sum encountered, we check if we have seen this sum before. If so, it means that the subarray between the current index and the index where this sum was last encountered has an equal number of 0s and 1s. We calculate the length of this subarray and update the maximum length accordingly.

Approach(Brute Force):
The brute force is simple, ie; check for all substrings.
Generate all substrings, and check validity. If valid, compute the answer.
Complexity:
Time Complexity - O(N^2)
Space Complexity - O(1)

Optimized approach-

1)Use hashmaps.
Keep a count of the difference of zeros and ones.
If we encounter a one, increment the variable. If we encounter zero, decrement it.

2)Basically, our array which was like [1,0,1,1,0,1,0,0,1] becomes something like [1,-1,1,1,-1,1,-1,-1,1]
Now our task simply boils down to finding the length of maximum subarray with sum equal to zero.​
Time Complexity - O(N)
Space Complexity  - O(N)
