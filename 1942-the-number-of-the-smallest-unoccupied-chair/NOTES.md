Approach:
1)Sorting Events: We need to process friends based on their arrival times
2)Min-Heap for Chairs: The smallest available chair can be easily found using a min-heap.
3)Handling Departures: When a friend leaves, we mark their chair as available again by pushing it
4)Tracking the Target Friend: Once the target friend sits on a chair, we immediately return that chair number

TC:(O(n \log n))
SC: (O(n))

​
