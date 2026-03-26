import java.util.Scanner;
//bai2
public class bai2ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int S = (n+1)*(n+4)/6;
        System.out.println("S= " +S);
    }
}
