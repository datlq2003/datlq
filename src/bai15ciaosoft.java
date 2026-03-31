import java.util.Scanner;

public class bai15ciaosoft {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            double S = 0;
            for (int i = 1; i <= n; i++) {
                S += 2.0 / (i * (i + 1));
            }
            System.out.println("S(" + n + ") = " + S);
        }
    }
}
