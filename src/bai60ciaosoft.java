import java.util.Scanner;

public class bai60ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int prev = 10;  // Khởi tạo lớn hơn bất kỳ chữ số nào (0-9)
        boolean tangDan = true;
        while (n > 0) {
            int chuso = n % 10;
            if (chuso >= prev) { // Nếu chữ số hiện >= chữ số bên phải => không tăng
                tangDan = false;
                break;
            }
            prev = chuso;
            n = n / 10;
        }
        if (tangDan) {
            System.out.println("Cac chu so tang dan tu trai sang phai.");
        } else {
            System.out.println("Khong tang dan tu trai sang phai.");
        }
    }
}
