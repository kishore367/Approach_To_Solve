Intuition
We focus on the number of zeros in the given nums array.

1. Brute-Force:-
In this procedure, we will take each index, and iterate through the entire array (using two for loops) along with multiplying the elements of the array & storing the multiplied the results in the resultant array. Imp - When ever we counter that particular outer-index, then only we will skip that index.
Time Complexity: O(n^2)
Space Complexity: O(1), 

2. Optimized:-
1)Here, we will use a simple fact, that Once you get the multiplied value of all the numbers in the array
2)you can easily get the desired index number by just dividing the index value by the total multiplied number
Time Complexity: O(n)
Space Complexity: O(1)​

3. Fully Optimized (Adhereing to the Question rules):-
Well, we just to multiply ALL the elements of the array, except itself (own index). We will accomplish this in a very smart way.
Time Complexity: O(n)
Space Complexity: O(1)
