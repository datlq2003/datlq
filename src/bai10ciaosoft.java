import java.util.Scanner;

public class bai10ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double T = 1;
        for (int i = 1; i <= n; i++) {
            T *= x;
        }
        System.out.println(x + " ^ " + n + " = " + T);
    }
}
