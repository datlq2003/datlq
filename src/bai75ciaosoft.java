import java.util.Scanner;

public class bai75ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Khong phai dang 2^k");
            return;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("La dang 2^k");
        } else {
            System.out.println("Khong phai dang 2^k");
        }
    }
}
