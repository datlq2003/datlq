import java.util.Scanner;

public class bai72ciaosoft {
    public static double S(double x, int n) {
        double sum = 0;
        double term = -x;
        for (int k = 1; k <= n; k++) {
            if (k > 1) {
                term = term * (-x) / k;
            }
            sum += term;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("S(x, n) = " + S(x, n));
    }
}
