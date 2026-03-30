import java.util.Scanner;

public class baitapbosung2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        int a = sc.nextInt();
        int sum = 0;
        a = Math.abs(a);
        while (a>0){
            sum+=a%10;
            a=a/10;
        }
        System.out.println("tổng các chữ số la : " +sum);
    }
}
