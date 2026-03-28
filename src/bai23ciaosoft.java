import java.util.Scanner;

public class bai23ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập n: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(count);
            }
        }
    }
}
