import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++){
            if (n%i==0 && i%2==0){
                count++;
            }
        }
        System.out.println("ước số chẵn của " + n+"là: " + count);
    }
}
