import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args){

        String text = "The text may be hard-coded as a String in your code";
        String letter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        letter = scanner.nextLine();
        char lettChar = letter.charAt(0);

        int a = 0;
        for (int i = 0; i <text.length(); i++)
        {
            if(text.charAt(i) == lettChar) {
                a++;
            }
        }
        System.out.println("The Letter '"+letter+"' appears "+a+" times.");
    }
}

