Intuition
The problem requires finding the minimum length of the string after deleting similar characters from both ends. We can achieve this by using two pointers, one starting from the beginning and the other from the end, and moving them towards each other while the characters at those positions are the same.

Approach(Two Pointer):
1)Initialize two pointers, start at the beginning and end at the end of the string.
2)While start is less than end:
 i)a. Shrink the common prefix and suffix by moving start and end towards each other while characters are equal.
iI)b. Move start one step forward and end one step backward.
3)Calculate the remaining string length as end - start + 1.
4)Return the minimum length of the remaining string.

Complexity
Time complexity:O(n)
Space complexity:O(1)​

Approach( Array and String):

1. For each matching left and right most character remove as many characters from both end as possible
2. At the end return the distance b/w rt and lt pointer

 Complexity
Time complexity:
O(n)

Space complexity:
O(1)
