Intuition
We are going to use the concept of recursion firstly to calculate the height and then to calculate the sums for each height level, eventually we calculate the average.

Approach
We use two arrays to calculate the sum for each level and the number of nodes per level, in the end we just need to divide these two arrays to obtain the average

Complexity
Time complexity:
height O(n) + averageOfLevelsRec O(n) + averageOfLevels O(n) = 3 * O(n) = O(n)

Space complexity:
O(n)​
