import java.util.Scanner;

public class bai76ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Khong phai dang 3^k");
            return;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        if (n == 1) {
            System.out.println("La dang 3^k");
        } else {
            System.out.println("Khong phai dang 3^k");
        }
    }
}
