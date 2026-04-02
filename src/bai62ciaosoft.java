import java.util.Scanner;

public class bai62ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("UCLN = " + a);
    }
}
