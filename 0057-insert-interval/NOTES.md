Intuition
We are just sorting and merging the intervals

Approach
Add given interval in the end of the array (using push_back() method)
after this we will sort the array and merge the intervals

Complexity
Time Complexity
Here we are sorting the array and it would take O(Nlog(N)) time
so time complexity would be O(Nlog(N)
Space Complexity
We have to return vector<vector> so we are making new container
Space complexity would be also O(N) in worst case (If all intervals can not be merged than we have to add all intervals in the result array)

Approach
take a variable i = 0 and traverse till the first element of any pair (Starting time of Interval) is greater than the first element of given interval then we are adding given interval using insert method

Complexity
Time complexity:
we are traversing all intervals given in the array so time complexity would be O(n)

Space complexity:
We have to return vector<vector> so we are making new container
Space complexity would be also O(N) in worst case (If all intervals can not be merged than we have to add all intervals in the result array)​
