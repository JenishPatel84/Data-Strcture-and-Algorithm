# 🌐 Java Browser History — Doubly Linked List

A beginner-friendly implementation of **Browser History using a Doubly Linked List in Java**.

This project demonstrates how browser navigation such as **visiting a new webpage, going backward, and going forward** can be implemented using a Doubly Linked List.

The project is useful for **Data Structures and Algorithms (DSA) practice**, especially for understanding the practical application of a Doubly Linked List.

---

## 📌 Features

This project implements the following browser operations:

### 🌐 Browser Operations

* Create browser history with a homepage
* Visit a new URL
* Move backward in browser history
* Move forward in browser history

### 🔗 Doubly Linked List Concepts

* `back` pointer to previous webpage
* `next` pointer to next webpage
* Maintain the current webpage
* Traverse in both directions

---

# 🧠 Problem Statement

Design a browser history system that supports the following operations:

1. Start from a given homepage.
2. Visit a new URL.
3. Move backward by a given number of steps.
4. Move forward by a given number of steps.

The browser history is represented using a **Doubly Linked List**.

---

# 🔗 Why Doubly Linked List?

A browser needs to move in two directions:

```text
Back     ←
Forward  →
```

A Doubly Linked List is suitable because every node contains two references:

* `back` → points to the previous webpage
* `next` → points to the next webpage

For example:

```text
null <- Google <-> Facebook <-> YouTube -> null
             ↑
        currentPage
```

If the user clicks **Back**, the `back` pointer is used.

If the user clicks **Forward**, the `next` pointer is used.

---

# 🏗️ Node Structure

Each webpage is represented using a `Node`.

```java
class Node {
    String data;
    Node back;
    Node next;

    public Node(String data) {
        this.data = data;
        this.back = null;
        this.next = null;
    }
}
```

Each node contains:

* `data` → stores the webpage URL
* `back` → points to the previous webpage
* `next` → points to the next webpage

---

# ⚙️ BrowserHistory Class

The `BrowserHistory` class maintains the current webpage.

```java
class BrowserHistory {
    Node currentPage;
}
```

The `currentPage` pointer represents the webpage currently open in the browser.

---

# 1. Create Browser History

The constructor creates the initial browser history using the given homepage.

```java
public BrowserHistory(String homepage) {
    currentPage = new Node(homepage);
}
```

### Example

```java
BrowserHistory browser =
    new BrowserHistory("leetcode.com");
```

Initial history:

```text
null <- leetcode.com -> null
             ↑
        currentPage
```

---

# 2. Visit a New URL

The `visit()` method creates a new node and connects it after the current webpage.

```java
public void visit(String url) {
    Node newNode = new Node(url);

    currentPage.next = newNode;
    newNode.back = currentPage;

    currentPage = newNode;
}
```

### Example

Suppose the current page is:

```text
leetcode.com
```

Visit:

```text
google.com
```

The history becomes:

```text
null <- leetcode.com <-> google.com -> null
                              ↑
                         currentPage
```

---

# 3. Go Back

The `back()` method moves the current webpage toward the previous page.

```java
public String back(int steps)
```

The method uses the `back` pointer.

### Example

Current history:

```text
leetcode.com <-> google.com <-> facebook.com <-> youtube.com
                                                     ↑
                                                currentPage
```

Call:

```java
browser.back(2);
```

The browser moves:

```text
youtube.com
      ↓
facebook.com
      ↓
google.com
```

Result:

```text
google.com
```

### Logic

```java
while (steps > 0) {
    if (currentPage.back != null) {
        currentPage = currentPage.back;
    } else {
        break;
    }

    steps--;
}
```

---

# 4. Go Forward

The `forward()` method moves the current webpage toward the next page.

```java
public String forward(int steps)
```

The method uses the `next` pointer.

### Example

Current history:

```text
leetcode.com <-> google.com <-> facebook.com <-> youtube.com
                     ↑
                currentPage
```

Call:

```java
browser.forward(2);
```

The browser moves:

```text
google.com
     ↓
facebook.com
     ↓
youtube.com
```

Result:

```text
youtube.com
```

### Logic

```java
while (steps > 0) {
    if (currentPage.next != null) {
        currentPage = currentPage.next;
    } else {
        break;
    }

    steps--;
}
```

---

# 🔄 Complete Browser History Example

Suppose the browser starts with:

```text
leetcode.com
```

### Step 1 — Visit Google

```text
leetcode.com <-> google.com
```

### Step 2 — Visit Facebook

```text
leetcode.com <-> google.com <-> facebook.com
```

### Step 3 — Visit YouTube

```text
leetcode.com <-> google.com <-> facebook.com <-> youtube.com
```

Current page:

```text
youtube.com
```

### Step 4 — Back 1 Step

```text
leetcode.com <-> google.com <-> facebook.com <-> youtube.com
                                   ↑
                              currentPage
```

Current page:

```text
facebook.com
```

### Step 5 — Back 1 More Step

```text
leetcode.com <-> google.com <-> facebook.com <-> youtube.com
                     ↑
                currentPage
```

Current page:

```text
google.com
```

### Step 6 — Forward 1 Step

Current page becomes:

```text
facebook.com
```

---

# 🧪 Main Class Example

The following `main()` method demonstrates all the operations:

```java
public class Main {
    public static void main(String[] args) {

        BrowserHistory browser =
            new BrowserHistory("leetcode.com");

        System.out.println("Initial Page: leetcode.com");

        browser.visit("google.com");
        System.out.println("Visit: google.com");

        browser.visit("facebook.com");
        System.out.println("Visit: facebook.com");

        browser.visit("youtube.com");
        System.out.println("Visit: youtube.com");

        String page = browser.back(1);
        System.out.println("Back 1 step: " + page);

        page = browser.back(1);
        System.out.println("Back 1 step: " + page);

        page = browser.forward(1);
        System.out.println("Forward 1 step: " + page);
    }
}
```

### Output

```text
Initial Page: leetcode.com
Visit: google.com
Visit: facebook.com
Visit: youtube.com
Back 1 step: facebook.com
Back 1 step: google.com
Forward 1 step: facebook.com
```

---

# 📊 Time Complexity

| Operation       | Time Complexity |
| --------------- | --------------: |
| Create Homepage |            O(1) |
| Visit           |            O(1) |
| Back            |            O(k) |
| Forward         |            O(k) |

Where **k = number of steps** moved backward or forward.

---

# 💾 Space Complexity

If the browser has visited `n` webpages:

```text
Space Complexity = O(n)
```

Each webpage is stored as one node.

Each node contains:

* URL
* `back` reference
* `next` reference

---

# 🔍 Data Structure Used

```text
Doubly Linked List
```

Node structure:

```text
        back             next
          ↓                ↓

null <- [ URL ] <------> [ URL ] <------> [ URL ] -> null
                              ↑
                         currentPage
```

---

# 💡 Key Concepts Learned

This project helps understand:

* Doubly Linked List
* Node creation
* `back` pointer
* `next` pointer
* Current node tracking
* Forward traversal
* Backward traversal
* Real-world application of linked lists
* Object-oriented programming in Java

---
