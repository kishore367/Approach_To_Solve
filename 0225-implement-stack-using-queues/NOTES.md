​Thought Process :-
Since stack works in LIFO method whereas queue works in FIFO so in order to make stack from queue, all we want is: new element that we are pushing in the queue should be come at the front of the queue so that whenever we perform top() or pop() operation on the queue it will work exaclty same as stack (because in the stack top() and pop() applied on the last in element).

2 Approaches: using 2 queues and a single queue

1st approach- using 2 queues
push(x)-
In this approach basically, we are doing push operation in three steps-
i) push new element to queue2 [x -> Q2]
ii) putting every element of queue1 to queue2 (element by element) [Q1 -> Q2]
iii) swap Queue2 with Queue1 [Q1 <-> Q2]

rest operation will work same now because recently pushed element is on the front now
que.pop(), que.top(), que.empty(), que.size()

Time Complexity - O(n)
Space Complexity - O(2n) ~ O(n)

2nd approach- using single queue
push(x)-
In the queue new element comes on the rear but we want to bring it to front so that it can work as stack (because in the queue top() and pop() works on front element).
step-1 push new element to queue [x -> que]
step-2 push every front element except new element [que.push(que.front())]

rest operations will work same now because recently pushed element is on the front now
que.pop(), que.top(), que.empty(), que.size()

Time Complexity - O(n)
Space Complexity - O(n)
