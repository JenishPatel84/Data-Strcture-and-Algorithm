# 🔗 Java Doubly Linked List — Basic Operations

A beginner-friendly implementation of a **Doubly Linked List in Java** covering the most important basic operations such as insertion, deletion, searching, counting nodes, converting an array into a linked list, and forward/backward traversal.

This project is created for **Data Structures and Algorithms (DSA) practice** and is useful for understanding how doubly linked lists work internally without using Java's built-in `LinkedList` class.

---

## 📌 Features

This project implements the following operations:

### 🔄 Conversion & Traversal

* Convert an array into a doubly linked list
* Print the doubly linked list in forward direction
* Print the doubly linked list in reverse direction
* Count the number of nodes
* Search for an element

### 🗑️ Deletion Operations

* Delete node at head
* Delete node at tail
* Delete kth node
* Delete node after a given node
* Delete node before a given node

### ➕ Insertion Operations

* Insert node at head
* Insert node at tail
* Insert node after a given node
* Insert node before a given node
* Insert node at kth position

---

## 🧠 What is a Doubly Linked List?

A **Doubly Linked List** is a linear data structure where each node contains three parts:

1. **Data** – stores the value
2. **Previous (`prev`)** – stores the reference to the previous node
3. **Next (`next`)** – stores the reference to the next node

Unlike a Singly Linked List, a Doubly Linked List allows traversal in **both forward and backward directions**.

### Structure

```text
        Previous        Next
           ↓             ↓

NULL <- +-------+-------+-------+ -> NULL
        | Prev  | Data  | Next  |
        +-------+-------+-------+
             ↕
        +-------+-------+-------+
        | Prev  | Data  | Next  |
        +-------+-------+-------+
             ↕
        +-------+-------+-------+
        | Prev  | Data  | Next  |
        +-------+-------+-------+
```

For example:

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
```

---

## 🏗️ Node Structure

Each node is created using the `Node` class:

```java
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

* `data` stores the value.
* `prev` stores the reference to the previous node.
* `next` stores the reference to the next node.
* The first node's `prev` points to `null`.
* The last node's `next` points to `null`.

---

# ⚙️ Operations

## 1. Array to Doubly Linked List

Converts an integer array into a doubly linked list.

### Example

```text
Array:

[1, 2, 3, 4, 5]

Doubly Linked List:

null <- 1 <-> 2 <-> 3 <-> 4 <-> 5 -> null
```

### Method

```java
public Node arrayToLinkedList(int[] arr)
```

---

## 2. Print Doubly Linked List

Traverses the doubly linked list from the head to the last node.

```java
public void print(Node head)
```

### Output

```text
1<->2<->3<->4<->5<->null
```

---

## 3. Print Doubly Linked List in Reverse

Traverses the doubly linked list from the last node to the first node using the `prev` pointer.

```java
public void printReverse(Node head)
```

### Example

```text
Doubly Linked List:

null <- 1 <-> 2 <-> 3 <-> 4 <-> 5 -> null
```

Reverse Output:

```text
5<->4<->3<->2<->1<->null
```

---

## 4. Count Nodes

Counts the total number of nodes present in the doubly linked list.

```java
public int countNode(Node head)
```

### Example

```text
1 <-> 2 <-> 3 <-> 4 <-> null
```

Output:

```text
Count = 4
```

---

## 5. Search an Element

Checks whether a particular value exists in the doubly linked list.

```java
public boolean search(Node head, int value)
```

### Example

```text
List: 10 <-> 20 <-> 30 <-> null

Search 20 → true
Search 50 → false
```

---

# 🗑️ Deletion Operations

## 6. Delete Node at Head

Removes the first node of the doubly linked list.

```java
public Node deleteAtHead(Node head)
```

### Before

```text
null <- 10 <-> 20 <-> 30 -> null
```

### After

```text
null <- 20 <-> 30 -> null
```

The new head's `prev` is changed to `null`.

### Logic

```java
head = head.next;

if (head != null) {
    head.prev = null;
}
```

---

## 7. Delete Node at Tail

Removes the last node from the doubly linked list.

```java
public Node deleteAtTail(Node head)
```

### Before

```text
null <- 10 <-> 20 <-> 30 -> null
```

### After

```text
null <- 10 <-> 20 -> null
```

The second-last node's `next` is changed to `null`.

---

## 8. Delete Kth Node

Deletes the node at the kth position.

```java
public Node deleteKthNode(Node head, int k)
```

### Example

```text
Before:

null <- 10 <-> 20 <-> 30 <-> 40 -> null

k = 3
```

### After

```text
null <- 10 <-> 20 <-> 40 -> null
```

The third node (`30`) is removed.

Both links are updated:

```text
20 <-> 40
```

---

## 9. Delete Node After Given Node

Deletes the node immediately after a node containing a given value.

```java
public Node deleteNodeAfterGivenNode(Node head, int value)
```

### Example

```text
Before:

null <- 10 <-> 20 <-> 30 <-> 40 -> null

value = 20
```

Node after `20` is `30`.

### After

```text
null <- 10 <-> 20 <-> 40 -> null
```

The links are updated so that `20` points to `40` and `40` points back to `20`.

---

## 10. Delete Node Before Given Node

Deletes the node immediately before the node containing a given value.

```java
public Node deleteNodeBeforeGivenNode(Node head, int value)
```

### Example

```text
Before:

null <- 10 <-> 20 <-> 30 <-> 40 -> null

value = 30
```

Node before `30` is `20`.

### After

```text
null <- 10 <-> 30 <-> 40 -> null
```

The `prev` and `next` references are updated.

### Important Edge Cases

The method handles:

* Empty list
* Single-node list
* Given value at head
* Given value at second node
* Given value not present in the list

---

# ➕ Insertion Operations

## 11. Insert at Head

Adds a new node at the beginning of the doubly linked list.

```java
public Node insertAtHead(Node head, int value)
```

### Before

```text
null <- 20 <-> 30 <-> 40 -> null
```

Insert `10`.

### After

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
```

Both `next` and `prev` references are updated.

---

## 12. Insert at Tail

Adds a new node at the end of the doubly linked list.

```java
public Node insertAtTail(Node head, int value)
```

### Before

```text
null <- 10 <-> 20 <-> 30 -> null
```

Insert `40`.

### After

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
```

The old tail's `next` points to the new node and the new node's `prev` points to the old tail.

---

## 13. Insert After Given Node

Inserts a new node after a node containing a specified key.

```java
public Node insertAfterGivenNode(Node head, int value, int key)
```

### Example

```text
Before:

null <- 10 <-> 20 <-> 40 -> null

Insert 30 after 20
```

### After

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
```

Both forward and backward links are updated.

---

## 14. Insert Before Given Node

Inserts a new node before a node containing a specified key.

```java
public Node insertBeforeGivenNode(Node head, int value, int key)
```

### Example

```text
Before:

null <- 10 <-> 30 <-> 40 -> null

Insert 20 before 30
```

### After

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
```

The `prev` and `next` references are updated accordingly.

---

## 15. Insert at Kth Position

Inserts a new node at a specified position.

```java
public Node insertKthNode(Node head, int value, int k)
```

### Example

```text
Before:

null <- 10 <-> 20 <-> 40 -> null

Insert 30 at position 3
```

### After

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
```

---

# 🔄 Forward and Backward Traversal

One of the main advantages of a Doubly Linked List is that it supports traversal in both directions.

### Forward Traversal

The `next` pointer is used:

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
        ────────────────────────>
```

Output:

```text
10 -> 20 -> 30 -> 40 -> null
```

### Backward Traversal

The `prev` pointer is used:

```text
null <- 10 <-> 20 <-> 30 <-> 40 -> null
                              <────
```

Output:

```text
40 -> 30 -> 20 -> 10 -> null
```

---

# 📊 Time Complexity

| Operation                | Time Complexity |
| ------------------------ | --------------: |
| Array → Linked List      |            O(n) |
| Print List               |            O(n) |
| Print Reverse List       |            O(n) |
| Count Nodes              |            O(n) |
| Search                   |            O(n) |
| Delete Head              |            O(1) |
| Delete Tail              |            O(n) |
| Delete Kth Node          |            O(n) |
| Delete After Given Node  |            O(n) |
| Delete Before Given Node |            O(n) |
| Insert at Head           |            O(1) |
| Insert at Tail           |            O(n) |
| Insert After Given Node  |            O(n) |
| Insert Before Given Node |            O(n) |
| Insert Kth Node          |            O(n) |

Where **n = number of nodes** in the linked list.

> Note: In this implementation, only the `head` pointer is maintained. Therefore, finding the tail requires traversing the list, making insertion/deletion at the tail **O(n)**. If a `tail` pointer were maintained, these operations could be performed in **O(1)**.

---

# 💾 Space Complexity

For a doubly linked list containing `n` nodes:

```text
Space Complexity = O(n)
```

Each node requires memory for:

* Data
* Reference to the previous node
* Reference to the next node

Compared to a Singly Linked List, a Doubly Linked List requires extra memory for the `prev` reference.

---

# 🔍 Singly vs Doubly Linked List

| Feature            | Singly Linked List | Doubly Linked List |
| ------------------ | ------------------ | ------------------ |
| Data               | Yes                | Yes                |
| Next Reference     | Yes                | Yes                |
| Previous Reference | No                 | Yes                |
| Forward Traversal  | Yes                | Yes                |
| Backward Traversal | No                 | Yes                |
| Memory Usage       | Lower              | Higher             |
| Pointer Management | Simpler            | More Complex       |

---
