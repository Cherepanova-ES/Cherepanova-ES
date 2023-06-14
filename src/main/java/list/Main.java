package list;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(17);
        list.insertAtStart(777);
        list.insertAt(2, 1);
        list.deleteAt(2);
        list.display();
    }
}