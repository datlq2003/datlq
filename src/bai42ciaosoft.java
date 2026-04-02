import java.util.Scanner;

public class bai42ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int k = (int)((-1 + Math.sqrt(1 + 8.0 * n)) / 2);
        System.out.println("Gia tri k lon nhat sao cho S(k) < n la: " + k);
    }
}
