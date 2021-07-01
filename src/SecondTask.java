import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        a = scanner.nextInt();
        System.out.println("Please enter a number from 0 to 100 to search in the array: ");
        b = scanner.nextInt();
        int[] arr = new int[a];
        setRandomArray(a, arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findNumberInArray(a, b, arr));
        bubbleSort(a, arr);
        System.out.println(findNumberBinary(a, b, arr));
    }

    public static void setRandomArray(int a, int[] arr) {
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static boolean findNumberInArray(int a, int b, int[] arr) {
        for (int i = 0; i < a; i++) {
            if (arr[i] == b) {
                return true;
            } else if (i == a - 1) {
                return false;
            }
        }
        return false;
    }

    public static boolean findNumberBinary(int a, int b, int[] arr) {
        int start = 0;
        int end = a - 1;
        while (!(start >= end)) {
            int c = start + (end - start) / 2;
            if (arr[c] == b) {
                return true;
            } else if (arr[c] > b) {
                end = c;
            } else {
                start = c + 1;
            }
        }
        return false;
    }

    public static void bubbleSort(int a, int[] arr) {
        boolean sort = false;
        int b;
        while (!sort) {
            sort = true;
            for (int i = 0; i < a - 1; i++) {
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
