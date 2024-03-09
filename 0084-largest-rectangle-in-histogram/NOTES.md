Approach 1 - BRUTE FORCE
1)Find a smaller element from both sides and then find the breadth using right-left-1
2)This Program will give TLE

Complexity
Time complexity:
O(N^2)

Space complexity:
O(N)

Approach 2 - Calculate Left and right smaller before hand
1)Use leftsmaller and rightsmaller array to calculate breadth and here we are storing breaking point i.e. just before a smaller element so breadth is rightsmaller[i] - leftsmaller[i] + 1
2)This will also give TLE

Complexity
Time complexity:
O(N)

Space complexity:
O(N)

Approach 3 - Optimal Monotonic Stack
1)Stack stores indexes in increasing form of heights if you encounter a smaller height compared to st.top() , st.top() would be making some rectangle before this point only so now h = st.top() what about width if 2)we have some elements in stack the first element after this h in stack would be smaller and till that point our h can make rectangle so it would be calculated from curr_pos - st.top() - 1 (Note this st.top is calculated after poping our height index) And if we dont have elements in stacks that means our widht is till this curr_pos​

Complexity
Time complexity:
O(N)

Space complexity:
O(N)
