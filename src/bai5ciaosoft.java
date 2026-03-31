import java.util.Scanner;

public class bai5ciaosoft {
    //Tính S(n) =1+1/3+1/5+...+1/2n+1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        double S = 0;
        for (int i=0;i<=n;i++){
            S+=1/(2*i+1);
        }
        System.out.println("S(n)= " +S);
    }
}
