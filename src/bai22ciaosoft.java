import java.util.Scanner;

public class bai22ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyen n :");
        int n = sc.nextInt();
        int tich = 1;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                tich*=i;
            }
        }
        System.out.println("tích các ước của "+n+ "là : " + tich);
    }
}
