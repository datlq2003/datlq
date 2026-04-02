import java.util.Scanner;

public class bai38ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        double S = Math.sqrt(1);
        for (int i=2;i<=n;i++){
            S = Math.pow(i+S,1.0/(i+1));
        }
        System.out.println("s = (" + n + ") = " + S);
    }
}
