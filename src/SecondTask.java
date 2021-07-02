import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        int arraySize;
        int searchNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        arraySize = scanner.nextInt();
        System.out.println("Please enter a number from 0 to 100 to search in the array: ");
        searchNumber = scanner.nextInt();
        int[] arr = new int[arraySize];
        setRandomArray(arraySize, arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findNumberInArray(arraySize, searchNumber, arr));
        bubbleSort(arraySize, arr);
        System.out.println(findNumberBinary(arraySize, searchNumber, arr));
    }

    public static void setRandomArray(int arraySize, int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static boolean findNumberInArray(int arraySize, int searchNumber, int[] arr) {
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] == searchNumber) {
                return true;
            }
        }
        return false;
    }

    public static boolean findNumberBinary(int arraySize, int searchNumber, int[] arr) {
        int start = 0;
        int end = arraySize - 1;
        while (start < end) {
            int c = start + (end - start + 1) / 2;
            if (arr[c] == searchNumber) {
                return true;
            } else if (arr[c] > searchNumber) {
                end = c - 1;
            } else {
                start = c + 1;
            }
        }
        return false;
    }

    public static void bubbleSort(int arraySize, int[] arr) {
        boolean sort = false;
        int b;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arraySize - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sort = false;
                    b = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = b;
                }
            }
        }
    }
}
