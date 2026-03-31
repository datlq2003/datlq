import java.util.Scanner;

public class bai9ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        long T = 1; // dùng long để tránh tràn số với n lớn
        for (int i = 1; i <= n; i++) {
            T *= i;
        }
        System.out.println("T(" + n + ") = " + T);
    }
}
