import java.util.Scanner;

public class bai18ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        System.out.println("nhap x:");
        int x = sc.nextInt();
        double S = 0;
        double gt = 1;
        double lt = 1;
        for (int i =0;i<=n;i++){
            if (i>0){
                lt *=x*x;
                gt *=(2*i-1)*(2*i);
            } S += lt/gt;
        }
        System.out.println("S(" + n + ") = " + S);
    }
}
