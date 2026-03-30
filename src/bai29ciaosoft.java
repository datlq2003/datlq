import java.util.Scanner;

public class bai29ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n:");
        int n = sc.nextInt();
        int max = 0;
        for (int i=n;i>=1;i--){
            if (n%i==0 && i%2!=0){
                max = i;
                break;
            }
        }
        System.out.println("ước lẻ lớn nhất của " + n+ "là" + max);
    }
}
