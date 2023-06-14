package hash;

public interface MyHashTable {
    void put (Object key, Object value);

    Object get (Object key);

    void remove(Object key);
    int size();
    void showTable();

}