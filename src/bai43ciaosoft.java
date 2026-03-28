import java.util.Scanner;

public class bai43ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên dương n :");
        int n = sc.nextInt();
        int count = String.valueOf(n).length();
        System.out.println("số lượng chữ số của "  + n + "là" + count);
    }
}
