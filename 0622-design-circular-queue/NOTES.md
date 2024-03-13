Solution 1: std::deque
Using a std::deque almost feels like cheating. Actually it is cheating as the problem description asks for the following:
You must solve the problem without using the built-in queue data structure in your programming language

Solution 2: queue
Because we have std::queue::back(), we can just use a std::queue instead.

Solution 3: std::vector and two pointers
This is maybe how the question was intended. Note that we need one more slot in the buffer to be able to differentiate isEmpty from isFull, but we avoid having an extra counter instead. solution that uses only a buffer of size k and a start and len instead, and avoids the extra empty slot. We could dynamically allocate a buffer just large enough using new and delete, but at this point we are better of with a vector.

Solution 4: linked list
 I am not doing linked list. A linked list is only very rarly a good choice, and I don't think this is one of them. :)

Alright just for completeness, but I don't recommand doing this because of the poor cache locality and overahead std::list has. EDIT We don't need to keep track of the size in an extra field, as std::list::size()

Complexity
Time complexity:
as there is no loop.
O(1)

Space complexity:

​
