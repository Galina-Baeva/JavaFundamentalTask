public class FirstTask {

    public static void main(String [] args){
        int a = 15;
        int b = 7;
        int c = 3;
        int d = 1;
        System.out.println(minFromFour(a, b, c, d));
    }

    public static int minFromTwo(int a, int b) {
         return a <= b ? a : b;
        }

    public static int minFromThree(int a, int b, int c) {
        return minFromTwo(minFromTwo(a, b), c);
    }

    public static int minFromFour (int a, int b, int c, int d) {
        return minFromTwo(minFromThree(a, b, c), d);
    }

}

