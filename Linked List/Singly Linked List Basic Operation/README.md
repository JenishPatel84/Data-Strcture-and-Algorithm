# 🔗 Java Singly Linked List — Basic Operations

A beginner-friendly implementation of a **Singly Linked List in Java** covering the most important basic operations such as insertion, deletion, searching, counting nodes, and converting an array into a linked list.

This project is created for **Data Structures and Algorithms (DSA) practice** and is useful for understanding how linked lists work internally without using Java's built-in `LinkedList` class.

---

## 📌 Features

This project implements the following operations:

### 🔄 Conversion & Traversal

* Convert an array into a linked list
* Print the linked list
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

## 🧠 What is a Singly Linked List?

A **Singly Linked List** is a linear data structure where each node contains:

1. **Data** – stores the value
2. **Next** – stores the reference to the next node

### Structure

```text
+-------+-------+     +-------+-------+     +-------+-------+
| Data  | Next  | --> | Data  | Next  | --> | Data  | Next  | --> null
+-------+-------+     +-------+-------+     +-------+-------+
```

For example:

```text
10 -> 20 -> 30 -> 40 -> null
```

---

## 🏗️ Node Structure

Each node is created using the `Node` class:

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

* `data` stores the value.
* `next` stores the reference to the next node.
* The last node points to `null`.

---

# ⚙️ Operations

## 1. Array to Linked List

Converts an integer array into a linked list.

### Example

```text
Array:
[1, 2, 3, 4, 5]

Linked List:
1 -> 2 -> 3 -> 4 -> 5 -> null
```

### Method

```java
public Node arrayToLinkedList(int[] arr)
```

---

## 2. Print Linked List

Traverses the linked list and prints every node.

```java
public void print(Node head)
```

### Output

```text
1->2->3->4->5->null
```

---

## 3. Count Nodes

Counts the total number of nodes present in the linked list.

```java
public int countNode(Node head)
```

### Example

```text
1 -> 2 -> 3 -> 4 -> null
```

Output:

```text
Count = 4
```

---

## 4. Search an Element

Checks whether a particular value exists in the linked list.

```java
public boolean search(Node head, int value)
```

### Example

```text
List: 10 -> 20 -> 30 -> null

Search 20 → true
Search 50 → false
```

---

# 🗑️ Deletion Operations

## 5. Delete Node at Head

Removes the first node of the linked list.

```java
public Node deleteAtHead(Node head)
```

### Before

```text
10 -> 20 -> 30 -> null
```

### After

```text
20 -> 30 -> null
```

### Logic

```java
return head.next;
```

---

## 6. Delete Node at Tail

Removes the last node from the linked list.

```java
public Node deleteAtTail(Node head)
```

### Before

```text
10 -> 20 -> 30 -> null
```

### After

```text
10 -> 20 -> null
```

The second-last node's `next` is changed to `null`.

---

## 7. Delete Kth Node

Deletes the node at the kth position.

```java
public Node deleteKthNode(Node head, int k)
```

### Example

```text
Before:
10 -> 20 -> 30 -> 40 -> null

k = 3

After:
10 -> 20 -> 40 -> null
```

The third node (`30`) is removed.

---

## 8. Delete Node After Given Node

Deletes the node immediately after a node containing a given value.

```java
public Node deleteNodeAfterGivenNode(Node head, int value)
```

### Example

```text
Before:
10 -> 20 -> 30 -> 40 -> null

value = 20
```

Node after `20` is `30`.

### After

```text
10 -> 20 -> 40 -> null
```

---

## 9. Delete Node Before Given Node

Deletes the node immediately before the node containing a given value.

```java
public Node deleteNodeBeforeGivenNode(Node head, int value)
```

### Example

```text
Before:
10 -> 20 -> 30 -> 40 -> null

value = 30
```

Node before `30` is `20`.

### After

```text
10 -> 30 -> 40 -> null
```

### Important Edge Cases

The method handles:

* Empty list
* Single-node list
* Given value at head
* Given value at second node
* Given value not present in the list

---

# ➕ Insertion Operations

## 10. Insert at Head

Adds a new node at the beginning of the linked list.

```java
public Node insertAtHead(Node head, int value)
```

### Before

```text
20 -> 30 -> 40 -> null
```

Insert `10`.

### After

```text
10 -> 20 -> 30 -> 40 -> null
```

---

## 11. Insert at Tail

Adds a new node at the end of the linked list.

```java
public Node insertAtTail(Node head, int value)
```

### Before

```text
10 -> 20 -> 30 -> null
```

Insert `40`.

### After

```text
10 -> 20 -> 30 -> 40 -> null
```

---

## 12. Insert After Given Node

Inserts a new node after a node containing a specified key.

```java
public Node insertAfterGivenNode(Node head, int value, int key)
```

### Example

```text
Before:
10 -> 20 -> 40 -> null

Insert 30 after 20
```

### After

```text
10 -> 20 -> 30 -> 40 -> null
```

---

## 13. Insert Before Given Node

Inserts a new node before a node containing a specified key.

```java
public Node insertBeforeGivenNode(Node head, int value, int key)
```

### Example

```text
Before:
10 -> 30 -> 40 -> null

Insert 20 before 30
```

### After

```text
10 -> 20 -> 30 -> 40 -> null
```

---

## 14. Insert at Kth Position

Inserts a new node at a specified position.

```java
public Node insertKthNode(Node head, int value, int k)
```

### Example

```text
Before:
10 -> 20 -> 40 -> null

Insert 30 at position 3
```

### After

```text
10 -> 20 -> 30 -> 40 -> null
```

---

# 📊 Time Complexity

| Operation                | Time Complexity |
| ------------------------ | --------------: |
| Array → Linked List      |            O(n) |
| Print List               |            O(n) |
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

---

# 💾 Space Complexity

For a linked list containing `n` nodes:

```text
Space Complexity = O(n)
```

Each node requires memory for:

* Data
* Reference to the next node

---

# ▶️ Example

The following array is converted into a linked list:

```java
int[] array = {1, 2, 3, 4, 5, 6, 7};
```

Initial list:

```text
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> null
```

After deleting the head:

```text
2 -> 3 -> 4 -> 5 -> 6 -> 7 -> null
```

After deleting the tail:

```text
2 -> 3 -> 4 -> 5 -> 6 -> null
```

After deleting the 3rd node:

```text
2 -> 3 -> 5 -> 6 -> null
```

After deleting the node after `3`:

```text
2 -> 3 -> 6 -> null
```

After inserting at head:

```text
1 -> 2 -> 3 -> 6 -> null
```
