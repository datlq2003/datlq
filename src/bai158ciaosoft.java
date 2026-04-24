import java.util.Scanner;

public class bai158ciaosoft {
    public class TimX {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so phan tu: ");
            int n = sc.nextInt();
            double[] a = new double[n];
            System.out.println("Nhap cac phan tu:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextDouble();
            }
            double x = 0;
            for (int i = 0; i < n; i++) {
                if (Math.abs(a[i]) > x) {
                    x = Math.abs(a[i]);
                }
            }
            System.out.println("Gia tri x can tim la: " + x);
            sc.close();
        }
    }
}
