Flood It!
By: Nandha Gopikannan and Chris Haleas

Questions:

1. What function roughly fits that graph?
The function that fits the graph is f(n) = n. Despite there being some inconsistencies, the graph largely aligns with f(n) = n.

2. What is the time complexity of your flood() function based on analyzing its code?
   Based on analyzing our flood() code, the time complexity is O(n). The first step was initializing the linked list and the array. The initialization of the linked list was O(1), but the array was O(n) as the program had to run through the board's values to get the array size. The next step is a for loop that initializes coordinates to the linked list. The for loop linearly iterated through flooded_list, which would have an O(n) time complexity. The next step is the while loop that runs until the linked list is empty. In this while loop, the first element of the queue is removed, which is an O(1) time complexity. Then, there is a for loop that loops through the tile coordinates to see if they have been visited. If they have not, they are flooded and marked as visited, and the neighbor coordinates are added to flooded_list and queue. This has an O(1) time complexity because there is always a constant number of neighbors to any given coordinate. The worst time complexity among all of the code's pieces is O(n), therefore this is the overall time complexity. This is a linear function, making it f(n) = n.
3. Does your analysis match up with what you see in the graph?
The analysis does match with the graph, as the graph shows a linear function -> f(n) = n. The time complexity concluded from our analysis is O(n), which is a linear function.
4. What data structures did you use (linked lists, arrays…) ? Is the time complexity of your flood function the best it can be or can you do better? Why?
We used arrays and linked lists to reach our optimal time complexity of O(n). We don't believe it can be improved beyond O(n) due to the constraints of a linked list, but we can try to create a more optimal O(n) function by using arrays and linked lists and separating the search through x and y coordinates. 
5. What is the time complexity of your alternative implementation? Comment the function with its time complexity in your code and write down the time complexity in your write-up.
The time complexity of our alternative implementation is also O(n), but it is a more optimal O(n) with a smaller rate of change. 

