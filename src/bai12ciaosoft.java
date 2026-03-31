import java.util.Scanner;

public class bai12ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double T = x; // số hạng đầu tiên
        for (int i = 1; i <= n; i++) {
            S += T;
            T *= x; // tính x^i tiếp theo
        }
        System.out.println("S(n) = " + S);
    }
}
