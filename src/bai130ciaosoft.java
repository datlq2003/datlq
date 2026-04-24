import java.util.Scanner;

public class bai130ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử: ");
        int n = sc .nextInt();
        double[] arr = new double[n];
        for (int i=0;i<n;i++){
            System.out.println("nhập arr = [ " + i + "");
            arr[i] = sc.nextDouble();
        }
    }
}
