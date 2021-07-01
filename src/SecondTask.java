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
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            if (arr[i] == b) {
                System.out.println("You have a good intuition");
                break;
            } else if (i == a-1) {
                System.out.println("Unfortunately your Number NOT found");
            }
        }
    }
}
