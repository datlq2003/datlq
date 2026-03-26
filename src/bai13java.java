import java.util.Scanner;

public class bai13java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên a: ");
        int a;
        int tong = 0;
        a = sc.nextInt();
        if (a%2 !=0) {
            System.out.println("mời nhập lại ");
        }else {
            for (int i=0;i<=a;i+=2){
                tong+=i;
            }
            System.out.println("tổng các số từ 0 đến " +a + "=" + tong);
        }
    }
}
