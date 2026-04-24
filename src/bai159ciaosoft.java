import java.util.Scanner;

public class bai159ciaosoft {

    public class DauTienLonHon2003 {
        public static double timGiaTri(double[] a) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 2003) {
                    return a[i]; // trả về giá trị đầu tiên thỏa
                }
            }
            return 0; // không có
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so phan tu: ");
            int n = sc.nextInt();
            double[] a = new double[n];
            System.out.println("Nhap cac phan tu:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextDouble();
            }
            double kq = timGiaTri(a);
            System.out.println("Ket qua: " + kq);
            sc.close();
        }
    }
}
