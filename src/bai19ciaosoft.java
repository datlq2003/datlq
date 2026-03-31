import java.util.Scanner;

public class bai19ciaosoft {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap x: ");
            double x = sc.nextDouble();
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            double S = 1 + x;
            double lt = x * x * x;
            double gt=3;
            for (int i = 1; i <= n; i++) {
                if (i > 1){
                    lt *= x * x;
                    gt *= (2*i) * (2*i + 1);
                }
                S += lt/gt;
            }

            System.out.println("S(" + n + ") = " + S);
        }
    }
}
