Introduction
In this solution, I want to describe to you several options how you can solve this problem using 2 stacks, 1 stack, and also with the execution of all functions in O(1).

Approach(Two Stacks):
Two stacks are used here:
1)queueHelper: it will have elements added from the push() function
2)queue: it will be peeked from by the peek() function and removed and returned by the pop() function
The idea is that we add all elements to the queueHelper stack, and when pop() is called, we check whether the queue stack is not empty, if it is empty, then elements from the queueHelper stack are transferred to the queue stack via pop(). The queue is not empty, then the last element is returned from it, if the pop() function is called, then this element is deleted.
The empty() function returns `true' only when both stacks are empty.​

Complexity
Time complexity
push(): O(1)
peek(): O(n)
push(): O(n)
empty(): O(1)
Space complexity: O(n)

Approach(One Stack)
Looking at the queueHelper from the previous example, you can see that the next element we need to get from the queue is at the top of the array/stack, so why don't we just use one stack and remove the element from the front.

Complexity
Time complexity
push(): O(1)
peek(): O(1)
push(): O(n)
Since the implementation of removing 0 element in different languages ​​can be different, we consider the worst case where all elements are moved back by 1 element.
empty(): O(1)
Space complexity: O(n)


Approach(All O(1))
There is still the problem that at least 1 function runs in O(n). How can it be optimized?

You can see that the main problem is that it is necessary to constantly either shift all elements if we remove 0 elements of the array, or copy elements from one stack to another if we use the first method. So why not get rid of these unnecessary operations?

Consider the stack simply as an array, then create a pointer that will refer to the element we have to return next. If the peek() function is called, then the element queue[next_pop] is returned, and if pop(), then this index moves forward by 1.

Complexity
Time complexity
push(): O(1)
peek(): O(1)
push(): O(1)
empty(): O(1)
Space complexity: O(n)
