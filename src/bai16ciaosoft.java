import java.util.Scanner;

public class bai16ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double T = x;
        for (int i = 1; i <= n; i++) {
            S += 2.0 * T / (i * (i + 1));
            T *= x;
        }
        System.out.println("S(" + n + ") = " + S);
    }
}
