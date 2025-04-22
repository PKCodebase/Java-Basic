package starPattern;

public class LeftAngledTriangle {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 1; i <= n; i++) {
            // print spaces first
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
