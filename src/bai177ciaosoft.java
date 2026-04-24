import java.util.Scanner;

public class bai177ciaosoft {
    public static void lietKeTrongDoan(double[] a, int n, double x, double y) {
        System.out.print("Cac phan tu trong doan [" + x + ", " + y + "]: ");
        for (int i = 0; i < n; i++) {
            if (a[i] >= x && a[i] <= y) {
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
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap y: ");
        double y = sc.nextDouble();
        lietKeTrongDoan(a, n, x, y);
    }
}
