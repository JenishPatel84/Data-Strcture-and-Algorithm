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

public class LinkedList {
    Node head;

    public Node arrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);

            mover.next = temp;
            temp.prev = mover;

            mover = temp;
        }

        return head;
    }

    public void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void printReverse(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public int countNode(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public boolean search(Node head, int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public Node deleteAtHead(Node head) {
        if (head == null) {
            return head;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    public Node deleteAtTail(Node head) {
        if (head == null) {
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        if (temp.prev != null) {
            temp.prev.next = null;
        } else {
            head = null;
        }

        return head;
    }

    public Node deleteKthNode(Node head, int k) {
        if (head == null) {
            return head;
        }

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;

            if (count == k) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                break;
            }

            temp = temp.next;
        }

        return head;
    }

    public Node deleteNodeAfterGivenNode(Node head, int value) {
        if (head == null) {
            return head;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            Node deleteNode = temp.next;

            temp.next = deleteNode.next;

            if (deleteNode.next != null) {
                deleteNode.next.prev = temp;
            }
        }

        return head;
    }

    public Node deleteNodeBeforeGivenNode(Node head, int value) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp != null && temp.prev != null) {
            Node deleteNode = temp.prev;

            if (deleteNode.prev != null) {
                deleteNode.prev.next = temp;
                temp.prev = deleteNode.prev;
            } else {
                head = temp;
                temp.prev = null;
            }
        }

        return head;
    }

    public Node insertAtHead(Node head, int value) {
        Node newNode = new Node(value);

        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;

        return head;
    }

    public Node insertAtTail(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public Node insertAfterGivenNode(Node head, int value, int key) {
        Node newNode = new Node(value);
        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;

            if (temp.next != null) {
                temp.next.prev = newNode;
            }

            temp.next = newNode;
        }

        return head;
    }

    public Node insertBeforeGivenNode(Node head, int value, int key) {
        Node newNode = new Node(value);
        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp;
            newNode.prev = temp.prev;

            if (temp.prev != null) {
                temp.prev.next = newNode;
            } else {
                head = newNode;
            }

            temp.prev = newNode;
        }

        return head;
    }

    public Node insertKthNode(Node head, int value, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(value);
            }

            return head;
        }

        if (k == 1) {
            return insertAtHead(head, value);
        }

        int count = 1;
        Node temp = head;

        while (temp != null && count < k - 1) {
            count++;
            temp = temp.next;
        }

        if (temp != null) {
            Node newNode = new Node(value);

            newNode.next = temp.next;
            newNode.prev = temp;

            if (temp.next != null) {
                temp.next.prev = newNode;
            }

            temp.next = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("arrayToLinkedList and print:");

        Node head = list.arrayToLinkedList(array);
        list.print(head);

        System.out.println("printReverse:");
        list.printReverse(head);

        System.out.println("countNode: " + list.countNode(head));

        System.out.println("search(4): " + list.search(head, 4));
        System.out.println("search(10): " + list.search(head, 10));

        head = list.deleteAtHead(head);
        System.out.print("deleteAtHead: ");
        list.print(head);

        head = list.deleteAtTail(head);
        System.out.print("deleteAtTail: ");
        list.print(head);

        head = list.deleteKthNode(head, 3);
        System.out.print("deleteKthNode(3): ");
        list.print(head);

        head = list.deleteNodeAfterGivenNode(head, 3);
        System.out.print("deleteNodeAfterGivenNode(3): ");
        list.print(head);

        head = list.deleteNodeBeforeGivenNode(head, 5);
        System.out.print("deleteNodeBeforeGivenNode(5): ");
        list.print(head);

        head = list.insertAtHead(head, 1);
        System.out.print("insertAtHead(1): ");
        list.print(head);

        head = list.insertAtTail(head, 7);
        System.out.print("insertAtTail(7): ");
        list.print(head);

        head = list.insertAfterGivenNode(head, 4, 5);
        System.out.print("insertAfterGivenNode(4, 5): ");
        list.print(head);

        head = list.insertBeforeGivenNode(head, 3, 5);
        System.out.print("insertBeforeGivenNode(3, 5): ");
        list.print(head);

        head = list.insertKthNode(head, 2, 3);
        System.out.print("insertKthNode(2, 3): ");
        list.print(head);

        System.out.println("Final Forward List:");
        list.print(head);

        System.out.println("Final Reverse List:");
        list.printReverse(head);
    }
}