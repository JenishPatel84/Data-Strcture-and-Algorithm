class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList{
    Node head;

    public Node arrayToLinkedList(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int countNode(Node head)
    {
        Node temp = head;
        int count  = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean search(Node head, int value)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == value)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node deleteAtHead(Node head)
    {
        if(head == null) return head;
        return head.next;
    }

    public Node deleteAtTail(Node head)
    {
        if(head == null) return head;
        Node temp = head;
        Node prev = null;

        while(temp.next != null)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }

    public Node deleteKthNode(Node head, int k)
    {
        if(head == null) return head;
        if(k==1) return head.next;

        Node temp = head;
        Node prev = null;
        int count = 0;

        while(temp!= null) {
            count++;
            if(count == k)
            {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public Node deleteNodeAfterGivenNode(Node head, int value)
    {
        if(head == null) return head;
        Node temp = head;
        Node preTemp = temp;
        while(preTemp.data != value)
        {
            preTemp = temp;
            temp = temp.next;
        }
        preTemp.next = temp.next;
        return head;
    }

    public Node deleteNodeBeforeGivenNode(Node head, int value)
    {
        if(head == null || head.next == null) return head;
        if(head.data == value) return head;
        if(head.next.data == value) return head.next;
        Node temp = head;
        Node preTemp = temp;
        Node prepreTemp = preTemp;
        while(temp.data != value && temp!= null)
        {
            prepreTemp = preTemp;
            preTemp = temp;
            temp = temp.next;
        }
        if(temp!=null) prepreTemp.next = temp;
        return head;
    }

    public Node insertAtHead(Node head, int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node insertAtTail(Node head, int value)
    {
        Node newNode = new Node(value);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public Node insertAfterGivenNode(Node head, int value, int key)
    {
        Node newNode = new Node(value);
        Node temp = head;
        Node preTemp = head;
        while(preTemp.data != key)
        {
            preTemp = temp;
            temp = temp.next;
        }
        newNode.next = temp;
        preTemp.next = newNode;
        return head;
    }

    public Node insertBeforeGivenNode(Node head, int value, int key)
    {
        Node newNode = new Node(value);
        Node temp = head;
        Node preTemp = head;
        while(temp.data != key)
        {
            preTemp = temp;
            temp = temp.next;
        }
        newNode.next = temp;
        preTemp.next = newNode;
        return head;
    }

    public Node insertKthNode(Node head, int value, int k)
    {
        if(head == null)
        {
            if(k == 1) {
                return new Node(value);
            }
        }
        int count = 0;
        Node temp = head;
        while(temp != null && count < k - 1)
        {
            count++;
            if(count == k-1)
            {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("arrayToLinkedList and print:");
        Node head = list.arrayToLinkedList(array);
        list.print(head);

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
    }
}