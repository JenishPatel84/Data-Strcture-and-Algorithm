# stackArray.cpp
## Stack Implementation Using Array in C++

## 📌 About the Project

This project demonstrates the implementation of a **Stack Data Structure using an Array in C++**. It is a menu-driven program that allows users to perform basic stack operations.

A stack follows the **LIFO (Last In, First Out)** principle, which means the last element inserted is the first element removed.

## 🚀 Features

- **Push:** Insert an element into the stack.
- **Pop:** Remove the top element from the stack.
- **Peek:** Display the top element without removing it.
- **Display:** Display all elements of the stack.
- **Stack Overflow:** Handle insertion when the stack is full.
- **Stack Underflow:** Handle deletion when the stack is empty.
- **Menu-Driven Program:** Select operations using a menu.

## 💻 Sample Output

```text
1. Push
2. Pop
3. Peek
4. Display
5. Exit

Enter your choice: 1
Enter value: 10
10 pushed into stack

Enter your choice: 1
Enter value: 20
20 pushed into stack

Enter your choice: 1
Enter value: 30
30 pushed into stack

Enter your choice: 4
Stack elements: 30 20 10

Enter your choice: 3
Top element: 30

Enter your choice: 2
30 popped from stack
```

## 📚 Stack Operations

| Operation | Description | Time Complexity |
|---|---|---|
| Push | Inserts an element at the top | O(1) |
| Pop | Removes the top element | O(1) |
| Peek | Returns the top element | O(1) |
| Display | Prints all stack elements | O(n) |

## 📖 Important Concepts

- **LIFO:** Last In, First Out.
- **Top:** An index that indicates the current top element.
- **Stack Overflow:** Occurs when inserting an element into a full stack.
- **Stack Underflow:** Occurs when removing an element from an empty stack.
- **Array:** Stores stack elements in contiguous memory locations.
