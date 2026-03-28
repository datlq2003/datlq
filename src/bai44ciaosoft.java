import java.util.Scanner;

public class bai44ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên dương n: ");
        int n = sc.nextInt();
        int tong =  0;
        int i=n;
        while (i>0){
            int chuso = i%10;
            tong +=chuso;
            i/=10;
        }
        System.out.println("tổng các chữ số của "+ n + "là: " + tong);
        }
    }
