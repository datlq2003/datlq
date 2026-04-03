import java.util.Scanner;

public class bai70ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double S = 0;
        double T = 0; // lưu tổng 1+2+...+i
        for (int i = 1; i <= n; i++) {
            T += i; // cập nhật tổng
            if (i % 2 == 0) {
                S -= 1.0 / T; // chẵn → trừ
            } else {
                S += 1.0 / T; // lẻ → cộng
            }
        }
        System.out.println("S = " + S);
    }
}
