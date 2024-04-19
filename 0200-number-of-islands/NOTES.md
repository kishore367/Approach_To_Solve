Intitution:
The Number of Islands problem involves finding and counting distinct clusters of connected '1's (representing land) in a 2D grid, where each '1' represents a piece of land and each '0' represents water.​

Approach (can be done both bfs or dfs)
1)Queue data structure: follows FIFO, and will always contain the starting.
2)Visited array: an array initialized to 0
2)In BFS, we start with a “starting” node, mark it as visited, and push it into the queue data structure.
3)In every iteration, we pop out the node ‘v’ and put it in the solution list, as we are traversing this node.
4)All the unvisited adjacent nodes from ‘v’ are visited next and are pushed into the queue. The list of adjacent neighbors of the node can be accessed from the adjacency list.

Time complexity:O(m*n)
Space Complexity: O(3N) ~ O(N), Space for queue data structure visited array and an adjacency list
