package list;

public class LinkedList implements MyList {
    Node head;

    @Override
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    @Override
    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    @Override
    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node newNode = new Node(data);

            Node currentNode = head;
            for (int i = 0; i < index-1 ; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    @Override
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index-1 ; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    @Override
    public void display() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("Связанный список пуст");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
        }
    }
}
