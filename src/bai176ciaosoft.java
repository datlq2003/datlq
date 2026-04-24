import java.util.Scanner;

public class bai176ciaosoft {
    public static void lietKeSoAm(double[] a, int n) {
        System.out.print("Cac so am trong mang: ");
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextDouble();
        }
        lietKeSoAm(a, n);
    }
}
