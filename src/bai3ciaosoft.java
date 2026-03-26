import java.util.Scanner;

public class bai3ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double gamma = 0.5572156649;
        double sum = Math.log(n) + gamma;
        System.out.println("S(n) = " + sum);
    }
}
