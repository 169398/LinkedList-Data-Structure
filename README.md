## LINKED LIST

This is a linear datastructure in  which elements are not stored at contiguous memory locations. In other words the elements are linked using pointers.

Here are a few advantages of a linked list that is listed below, it will help you understand why it is necessary to know.

Dynamic Data structure: The size of memory can be allocated or de-allocated at run time based on the operation insertion or deletion.
Ease of Insertion/Deletion: The insertion and deletion of elements are simpler than arrays since no elements need to be shifted after insertion and deletion, Just the address needed to be updated.
Efficient Memory Utilization: As we know Linked List is a dynamic data structure the size increases or decreases as per the requirement so this avoids the wastage of memory. 
Implementation: Various advanced data structures can be implemented using a linked list like a stack, queue, graph, hash maps, etc.

## Types of linked Lists : 
 
1. Singly Linked List: In a singly linked list, each element contains a reference to the next element in the sequence and not to any previous elements. Traversing in it is done in forward direction.
![Image if single linkedlist](image_path)

 2. Double-Linked list : In this type, each element contains a reference to the previous node and the next one.But it requires additional memory for backward reference.
 ![double linked-list ]( path)

 3. Circular linked list : In a circular linked list, the last node points to the first node in the sequence, creating a circular structure and can be singly or doubly linked.
  ![double linked-list ]( path)

## Operations on Linked Lists:
1. **Insertion** - Inserting an element at the beginning or end of a 
1. **Insertion** - Adding a new node to a linked list involves adjusting the pointers of the existing nodes to maintain the proper sequence. Insertion can be performed at the beginning, end, or any position within the list
2. **Deletion**- Removing a node from a linked list requires adjusting the pointers of the neighboring nodes to bridge the gap left by the deleted node. Deletion can be performed at the beginning, end, or any position within the list.
3. **Searching** - Searching for a specific value in a linked list involves traversing the list from the head node until the value is found or the end of the list is reached.

## Advantages of Linked lists:
1. **Dynamic Data Structure** - The size of memory can be allocated or-allocated at run based on the operation insert or deletion.
2. **Ease of InsertionDeletion** - insertion and deletion of elements are simpler than arrays since elements need to be shifted after insertion and deletion, Just the address needed to be updated. 
3. **Efficient Memory Utilization** -As we know Linked List is a dynamic data structure the size increases or decreases as per the requirement so this avoids the wastage of memory. 4. Implementation: Various advanced data structures can be implemented using a linked list like a stack, queue, graph, hash maps, etc.

## Disadvantages  of Linked Lists:

1. **Access time** - Accessing an element in a linked list is slower than in an array because you have to traverse through the list to reach the desired element.
2. **Extra memory** - Each node in a linked list requires extra memory to store the address of the next node.
No random access: Unlike arrays, linked lists do not support random access to elements.
3. **Increased complexity** - Implementing some operations, such as searching for an element, can be more complex in a linked list than in an array.



## Conclusion

🎉 Thank you for exploring the world of linked lists with me! 🎉

Linked lists are a fundamental data structure in computer science, offering dynamic memory allocation, efficient insertion and deletion operations, and the ability to implement various advanced data structures. However, they also have some disadvantages, such as slower access time and increased complexity for certain operations.

I hope this README and this repository has provided you with a solid understanding of linked lists and their types, operations, advantages, and disadvantages.

🌟 Contributions are welcome! 🌟
If you have any suggestions, improvements, or additional content to add, please feel free to contribute to this repository. Together, we can make this resource even better for the community.

Happy coding! 😄
