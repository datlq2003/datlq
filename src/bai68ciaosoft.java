import java.util.Scanner;

public class bai68ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= x * x; // tính x^(2i)
            if (i % 2 == 0) {
                S += pow; // chẵn → +
            } else {
                S -= pow; // lẻ → -
            }
        }
        System.out.println("S = " + S);
    }
}
