public class FirstTask {
    public static void main (String[] args) {
        int a = 5;
        int b = 6;
        int c = 4;
        int d = 4;
        int min = 0;
// min between 2
        if (a <= b) {
            min = a;
        } else {
            min = b;
        }
        System.out.println(min);
// min between 3
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println(min);
// min between 4
        if (a <= b && a <= c && a <= d) {
            min = a;
        } else if (b <= c && b <= d) {
            min = b;
        } else if (c <= d) {
            min = c;
        } else {
            min = d;
        }
        System.out.println(min);
    }
}
