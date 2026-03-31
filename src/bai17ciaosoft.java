import java.util.Scanner;

public class bai17ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap x: ");
        int x = sc.nextInt();
        double S = 0;
        double gt=1;
        double luythua=1;
        for (int i=1; i<=n;i++){
            luythua*=x;
            gt*=i;
            S += luythua/gt;
        }
        System.out.println("S+(" + n + ") = " + S);
    }
}
