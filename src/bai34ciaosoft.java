import java.util.Scanner;

public class bai34ciaosoft {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            double S = 0;
            for (int i = 1; i <= n; i++) {
                S += Math.sqrt(i);
            }
            System.out.println("S(" + n + ") = " + S);
        }
    }
