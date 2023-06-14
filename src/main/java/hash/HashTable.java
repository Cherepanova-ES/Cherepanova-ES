package hash;

public class HashTable implements MyHashTable {
    private static final int INITIAL_CAPACITY = 20; //начальная вместимость
    private Node[] table;
    private int size;

    private static class Node {
        Object key, value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    public HashTable() {
        this.table = new Node[INITIAL_CAPACITY];
        this.size = 0;
    }

    public int size() {
        return size;
    }
    //добавление элемента
    public void put(Object key, Object value) {
        if (key == null) {
            return; // если ключ равен 0 то эжлемент не может быть добавлен в таблтцу и метод завершается
        }
        int hash = getHash(key);
        Node head = table[hash];
        while (head != null) {// перебирает все элеиенты в текущей ячейке
            if (head.key.equals(key)) { //совпадает ли ключ тек элемента с доб ключем а если ключи не совпадают то хед переходит к след элементу
                return; //метод завершается. если хед равно 0 то новый элемент добавляется в нчало
            }
            head = head.next;
        }
        size++;
        Node newNode = new Node(key, value);
        newNode.next = table[hash];
        table[hash] = newNode;
        if (size >= table.length * 0.75) {
            resize();
        }
    }
    private int getHash(Object key) {
        return key.hashCode() % table.length;
    }
    //поиск значения по ключу
    public Object get(Object key) {
        if (key == null) {
            return null;
        }
        int hash = getHash(key);
        Node head = table[hash];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    //удаление элемента
    public void remove(Object key) {
        if (key == null) {
            return;
        }
        int hash = getHash(key);
        Node head = table[hash];
        Node prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    table[hash] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }
    private void resize() {
        Node[] oldTable = table;
        table = new Node[table.length * 2];
        size = 0;
        for (Node head : oldTable) {
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }
    public void showTable() {
        for (int i = 0; i < table.length; i++) {
            Node head = table[i];
            System.out.print("[" + i + "]: ");
            while (head != null) {
                System.out.print("(" + head.key + ", " + head.value + ")");
                head = head.next;
            }
            System.out.println();
        }
    }
}
