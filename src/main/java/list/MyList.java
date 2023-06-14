package list;

public interface MyList {
    void insert(int data);

    void insertAtStart(int data);

    void insertAt(int index, int data);

    void deleteAt(int index);
    void display();
}
