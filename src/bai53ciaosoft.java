import java.util.Scanner;

public class bai53ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int temp = n;
        int max = 0;
        while (temp > 0) {
            int chuso = temp % 10;
            if (chuso > max) {
                max = chuso;
            }
            temp /= 10;
        }temp = n;
        int dem = 0;
        while (temp>0){
            int chuso = temp%10;
            if (chuso==max) {
                dem++;
            }temp/=10;
        }
        System.out.println("chữ số lớn nhất là" + max);
        System.out.println("số lần xuất hiện là "+ dem);
    }
}
