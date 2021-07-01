import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arrays size: ");
        a = scanner.nextInt();

        int[] arr = new int[a];
        setRandomArray(a, arr);
        System.out.println(Arrays.toString(arr));
        bubbleSort(a, arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();

        int[] arr2 = new int[a];
        setRandomArray(a, arr2);
        System.out.println(Arrays.toString(arr2));
        insertionSort(a, arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void setRandomArray(int a, int[] arr) {
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            arr[i] = random.nextInt(100);
        }
    }
    public static void bubbleSort (int a, int[] arr) {
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

    public static void insertionSort (int a, int[] arr) {
        for (int i = 1; i < a; i++) {
            int c = arr[i];
            int j = i - 1;
            while (j >= 0 && c < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = c;
        }
    }
}
