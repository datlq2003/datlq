import java.util.Scanner;

public class bai17java {
    /*tìm những số chia hết cho 3 từ 10 đến 50 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên n: ");
        int n = sc.nextInt();
        for (int i=10;i<=n;i++){
            if (i%3 ==0)
                System.out.println(i+ "");
        }
    }
}
