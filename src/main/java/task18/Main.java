package task18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 9, 2, 5, 7, 1, 6};
        int maxIndex = 0;

        // Ищем индекс максимального элемента
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int[] leftArray = Arrays.copyOfRange(arr, 0, maxIndex);
        int[] rightArray = Arrays.copyOfRange(arr, maxIndex + 1, arr.length);


        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Максимальный элемент: " + arr[maxIndex]);
        System.out.println("Элементы слева от максимального: " + Arrays.toString(leftArray));
        System.out.println("Элементы справа от максимального: " + Arrays.toString(rightArray));
    }
}
