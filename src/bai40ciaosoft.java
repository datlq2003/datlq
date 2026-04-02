import java.util.Scanner;

public class bai40ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        System.out.println("nhap x:");
        int x = sc.nextInt();
        double S = Math.sqrt(x);
        for (int i = 2; i <= n; i++) {
            S = Math.sqrt(Math.pow(x, i) + S);  // S = √(x^i + S)
        }
        System.out.println("Ket qua S = " + S);
    }
}
