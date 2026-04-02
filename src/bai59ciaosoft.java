
import java.util.Scanner;


public class bai59ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        int original = n;  // Lưu số gốc
        int rev = 0;       // Biến lưu số đảo ngược
        while (n > 0) {
            int digit = n % 10;       // Lấy chữ số cuối
            rev = rev * 10 + digit;   // Cập nhật số đảo ngược
            n = n / 10;               // Bỏ chữ số cuối
        }
        if (rev == original) {
            System.out.println(original + " la so doi xung.");
        } else {
            System.out.println(original + " khong phai la so doi xung.");
        }
    }
}

