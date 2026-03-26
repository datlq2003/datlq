import java.util.Scanner;
/*viết  phương trình tính tổng  các số lẻ từ 1 đến n*/
public class bai15java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên n: ");
        int n;
        int tong = 0;
        n = sc.nextInt();
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                if (i == 3)
                    continue;
                else
                    tong +=i;
            }System.out.println("tổng số lẻ từ 1 đến " + n + "=" + tong);
        }
    }
}