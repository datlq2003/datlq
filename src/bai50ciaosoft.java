import java.util.Scanner;

public class bai50ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int temp = n;
        int sodao = 0;
        while (temp>0){
            int chusocuoi = temp%10;
            sodao = sodao * 10 + chusocuoi;
            temp /=10;
        }
        System.out.println("số đảo ngược là: " + sodao);
    }
}
