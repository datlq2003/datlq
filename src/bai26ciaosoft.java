import java.util.Scanner;

public class bai26ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int tich = 1;
        for (int i=1;i<=n;i+=2){
            if (n%i==0 && i%2!=0){
                tich*=i;
            }
        }
        System.out.println("tích các ước lẻ của " + n +"là: " + tich);
    }
}
