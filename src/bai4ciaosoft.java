import java.util.Scanner;

public class bai4ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = sc.nextDouble();
        for (int i=1;i<=n;i++) {
            sum += 1 / i;
            System.out.println("S(n)= " + sum);
        }
    }
}
