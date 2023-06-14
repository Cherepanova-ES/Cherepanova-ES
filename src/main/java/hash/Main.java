package hash;

public class Main {
    public static void main(String[] args) {
        HashTable myHashMap = new HashTable();
        myHashMap.put(2, "Воронеж");
        myHashMap.put(4, "Катя");
        myHashMap.put(3, "89507663211");

        System.out.println(myHashMap.get(4));
        System.out.println("Размер хэш-таблицы "+ myHashMap.size());
        myHashMap.remove(2);
        System.out.println("Размер хэш-таблицы "+myHashMap.size());
        myHashMap.showTable();

    }
}