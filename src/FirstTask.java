public class FirstTask {

    public static void main(String [] args){
        int a = 5;
        int b = 1;
        int c = 23;
        int d = 16;
        int min = minFromFour(a, b, c, d);
        System.out.println(min);
    }

    public static int minFromTwo(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minFromThree(int a, int b, int c) {
        int min = minFromTwo(a, b);
        if (c <= min) {
            return c;
        } else {
            return min;
        }
    }

    public static int minFromFour (int a, int b, int c, int d) {
        int min = minFromThree(a, b, c);
        if (d <= min) {
            return d;
        } else {
            return min;
        }
    }

}

