Idea:
Now the question arises why can't we directly find the total subarray with sum==goal , what is the need of doing difference of subarray with sum<=goal - subarray with sum<=goal-1.
Answer to this is that when we apply direct sliding window on sum==goal we have chances of missing a subarray as the array consist of only 1's and 0's, so chances are that we have 0's in between that can be added without making changes when sum==goal

Brute Force Approach:
Using nested loops iterate through the array and calculate the sum of subarray from each index, and count the total occurences where the sum of the subarray matches with our given goal.
Complexity
Time complexity: O(N^2)
Space complexity: O(1)

Optimised Approach using Sliding Window:
Using sliding window technique we find the total number of subarray with sum==goal as ((total subarray with sum<=goal) - (total subarray with sum<=goal-1)), here we calculate the difference in order to get the count of total subarray with sum==goal,

Complexity
Time complexity: O(N)
Space complexity: O(1)

​
