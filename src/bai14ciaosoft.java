import java.util.Scanner;

public class bai14ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double T = x; // số hạng đầu x^1
        for (int i = 0; i <= n; i++) {
            S += T;       // cộng số hạng
            T *= x * x;   // nhân x^2 để ra số hạng tiếp theo
        }
        System.out.println("S(n) = " + S);
    }
}
