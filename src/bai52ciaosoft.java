import java.util.Scanner;

public class bai52ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int temp = n;
        int sonhonhat = 9;
        while (temp>0){
        int chuso = temp%10;
        if (chuso<sonhonhat) {
            sonhonhat = chuso;
        }temp /=10;
        }
        System.out.println("số nhỏ nhất là " + sonhonhat);
    }
}
