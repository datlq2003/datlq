import java.util.Scanner;

public class bai71ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double pow = 1;
        double T = 0;
        for (int i = 1; i <= n; i++) {
            pow *= x;
            T += i;
            if (i % 2 == 0) {
                S += pow / T;
            } else {
                S -= pow / T;
            }
        }
        System.out.println("S = " + S);
    }
}
