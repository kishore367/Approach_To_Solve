Approach
1)This question is very simple. All we have to do is just to calculate node values from l1 and l2
2)We will implement simple algorithm and create a new LinkedList.
3)First of all, we create dummy node with value 0(you can put any number instead of 0).
4)We copy dummy pointer and create result pointer. I'll explain why we need result pointer later.​
5)Extract the digit by taking the modulo 10 of the total sum and update the carry for the next iteration by dividing the total sum by 10.

Time complexity: O(n)   Space complexity:O(n)
