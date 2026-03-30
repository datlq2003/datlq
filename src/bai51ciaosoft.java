import java.util.Scanner;

public class bai51ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int temp = n;
        int solonnhat = 0;
        while (temp>0){
            int chuso = temp%10;
            if (chuso>solonnhat){
                solonnhat=chuso;
            }temp/=10;
        }
        System.out.println("chữ số lớn nhất là " + solonnhat);
    }
}
