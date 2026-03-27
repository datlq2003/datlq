import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class bai21ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên dương n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                sum +=i;
            }
        }
        System.out.println("tổng các ước "+ n+ "là :"+ sum);
    }
}
