# 1️⃣ What is a Stack?
A stack is a Last-In-First-Out (LIFO) data structure.

The last element added is the first to be removed.
Think of a stack of plates: You add plates to the top and remove from the top.

✅ Real-world Examples:
- Undo/Redo in text editors
- Browser history (Back button)
- Expression evaluation in compilers (e.g., handling parentheses)

✅ Operations of a Stack:
- push(x)	Add an element x to the top of the stack.
- pop()	Remove and return the top element.
- peek()	Return the top element without removing it.
- isEmpty()	Check if the stack is empty.
  2️⃣ How to Answer Stack Questions in an Interview
  Common Interview Question
  "Can you implement a stack from scratch in Java?"

How to Answer
✅ Step 1: Explain the two common implementations:

Using an array (Fixed size, fast access)
Using a linked list (Dynamic size, slower but flexible)
✅ Step 2: State which one you're implementing and why.

If using arrays, mention its O(1) push/pop time complexity.
If using linked lists, mention that it avoids fixed size limitations.
✅ Step 3: Start coding while explaining each method.


# 1️⃣ What is a Queue?
A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle.

The first element added is the first to be removed.
Think of a real-world queue (line) at a bus stop:
The first person in line gets on the bus first.
The last person in line waits for their turn.

✅ Real-world Examples of Queues:

Print Queue (Documents print in order)
Task Scheduling (CPU task execution, Thread pools)
Call Center System (First call received is the first to be answered)

✅ Operations of a Queue:
- enqueue(x)	Insert an element x at the rear (end).
- dequeue()	Remove and return the front element.
- peek()	Return the front element without removing it.
- isEmpty()	Check if the queue is empty.

2️⃣ How to Answer Queue Questions in an Interview

- "Can you implement a queue from scratch in Java?"

How to Answer
✅ Step 1: Explain the two common implementations:

Using an array (Fixed size, fast access)
Using a linked list (Dynamic size, flexible)
✅ Step 2: State which one you're implementing and why.

If using arrays, mention that O(1) enqueue/dequeue is possible with a circular queue.
If using linked lists, mention that it avoids fixed-size limitations.
✅ Step 3: Start coding while explaining each method.

