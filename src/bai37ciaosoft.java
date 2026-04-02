import java.util.Scanner;

public class bai37ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = Math.sqrt(1);
        for (int i = 2; i <= n; i++) {
            S = Math.sqrt(i + S);
        }
        System.out.println("S(" + n + ") = " + S);
    }
}
