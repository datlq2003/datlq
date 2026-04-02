import java.util.Scanner;

public class bai67ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++) {
            double term = Math.pow(x, i);
            if (i % 2 == 0) {
                S -= term; // số chẵn: dấu -
            } else {
                S += term; // số lẻ: dấu +
            }
        }
        System.out.println("S = " + S);
    }
}
