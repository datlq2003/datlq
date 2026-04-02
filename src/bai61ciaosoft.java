import java.util.Scanner;

public class bai61ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();
        int prev = 0;
        boolean giamdan = true;
        while (n>0){
            int chuso = n%10;
            if (chuso<=prev){
                giamdan = false;
                break;
            }
            prev=chuso;
            n = n/10;
        }if (giamdan){
            System.out.println("cac so giam dan tu trai sang phai");
        }else {
            System.out.println("cac so khong giam tu trai sang phai");
        }
    }
}
