package task14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MemoryCell memoryCell = new MemoryCell();
        System.out.println(Arrays.toString(memoryCell.fillCell(1)));
        System.out.println(Arrays.toString(memoryCell.fillCell(4)));
        System.out.println(Arrays.toString(memoryCell.fillCell(2)));
        System.out.println(Arrays.toString(memoryCell.fillCell(6)));
    }
}
