1. Approach(Brute Force)
 i)The approach in the current code is to iterate through the array and use a nested loop to check for duplicates.
 ii)If a number is not a duplicate, it is added to the result array. The variable k keeps track of the length of the resulting array without duplicates.

Complexity :
Time complexity: O(n^2) - The nested loop for checking duplicates may take up to O(n) time for each element, resulting in O(n^2) in the worst case.
Space complexity: O(1) - The space used is constant as it does not depend on the size of the input array.

Optimized Time Complexity: The above solution has a time complexity of O(n^2) due to the nested loop. We can optimize it to O(n) using a more efficient approach.
Space Complexity: The space complexity is already good (O(1)), as it uses a constant amount of space.

2.Approach(​Two Pointer)

Optimizations
Single Loop: Instead of using a nested loop, we only need a single loop to iterate through the array once.
Two-Pointer Approach: Use two pointers (i and k) to keep track of the current and next positions in the resulting array. If the current element is different from the previous one, add it to the resulting array.

Complexity (Improved)
Time complexity: O(n) - We only iterate through the array once.
Space complexity: O(1) - The space used is constant as it does not depend on the size of the input array.
