import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arrays size: ");
        a = scanner.nextInt();
        Random random = new Random();

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

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
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] arr2 = new int[a];
        for (int i = 0; i < a; i++) {
            arr2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 1; i < a; i++) {
            int c = arr2[i];
            int j = i - 1;
            while (j >= 0 && c < arr2[j]) {
                arr2[j + 1] = arr2[j];
                j--;
            }
            arr2[j + 1] = c;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
