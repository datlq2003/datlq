import java.util.Scanner;

public class bai11ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        long S = 0; // tổng
        long T = 1; // giai thừa tạm thời
        for (int i = 1; i <= n; i++) {
            T *= i;
            S += T;    // cộng vào tổng
        }
        System.out.println("S(" + n + ") = " + S);
    }
}
