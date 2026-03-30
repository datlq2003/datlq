import java.util.Scanner;

public class bai32ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        boolean lasochinhphuong = false;
        for (int i=0;i*i<=n;i++){
            if (i*i==n){
                lasochinhphuong = true;
                break;
            }
        }if (lasochinhphuong){
            System.out.println(n+"là số chính phương");
        }else {
            System.out.println(n+"không phải số chính phương");
        }
    }
}
