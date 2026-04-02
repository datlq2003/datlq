import java.util.Scanner;

public class bai39ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        double[] fact = new double[n + 1];
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }
        double S = Math.sqrt(fact[1]);
        for (int i = 2; i <= n; i++) {
            S = Math.pow(fact[i] + S, 1.0 / (i + 1));
        }
    }
}
