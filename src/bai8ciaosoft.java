import java.util.Scanner;

public class bai8ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        double S = 0;
        for (int i =1;i<=n;i++){
            S+=(double)(2*i+1)/(2*i+2);
        }
        System.out.println("S(n)= " + S);
    }
}
