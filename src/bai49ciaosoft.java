import java.util.Scanner;

public class bai49ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        while (n>=10){
            n/=10;
        }
        System.out.println("chữ số đầu tiên là" + n);
    }
}
