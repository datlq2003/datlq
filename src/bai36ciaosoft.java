import java.util.Scanner;

public class bai36ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
            S += Math.sqrt(gt);
        }
        System.out.println("S(" + n + ") = " + S);
    }
}
