import java.util.Scanner;

public class bai33ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        for (int i=0;i<=n;i++){
            S = Math.sqrt(2+S);
        }
        System.out.println("S + (" + n + ") = " + S);
    }
}
