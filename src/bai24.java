import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0 && i%2!=0){
            System.out.println("ước số lẻ của " + n+ " là" + i);
        }
    }
    }
}
