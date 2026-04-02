import java.util.Scanner;

public class bai69ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x:");
        int x = sc.nextInt();
        System.out.println("nhap n:");
        int n = sc.nextInt();
        double S = 0;
        for (int i = 0; i <= n; i++) {
            double term = Math.pow(x, 2*i + 1);
            if (i % 2 == 0) {
                S += term;
            }else {
                S -= term;
            }
        }
    }
}
