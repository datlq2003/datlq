import java.util.Scanner;

public class bai41ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n (so dau phan so): ");
        int n = sc.nextInt();
        double S = 1.0;
        for (int i = 2; i <= n; i++) {
            S = 1.0 / (1 + S);
        }
        System.out.println("Ket qua S = " + S);
    }
}
