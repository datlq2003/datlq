import java.util.Scanner;

public class datlq {
    public static void main(String[] args) {
        int a;
        int tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a = ");
        a = sc.nextInt();
        if (a%2 !=0)
        System.out.println("không tính số lẻ");
        else {
            for(int i=0;i<=a;i+=2){
                tong+=i;
                System.out.println("tổng các số chẵn từ "+a+"="+tong);
            }
        }
    }
    }

