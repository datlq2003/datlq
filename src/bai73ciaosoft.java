import java.util.Scanner;

public class bai73ciaosoft {
    public static double S(double x, int n){
        int sum = -1;
        int term = -1;
        for (int k=1;k<=n;k++){
            term *= (-x * x) / (2 * k - 1) / (2 * k);
            sum += term;
        } return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x:");
        double x = sc.nextDouble();
        System.out.println("nhap n:");
        int n = sc.nextInt();
        System.out.println(" S(x,n) = " + S(x,n));
    }
}
