import java.util.Scanner;

public class bai126ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng của mảng: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập arr [ " + i + " ] ");
            arr[i] = sc.nextDouble();
        }
        double sum = 0;
        for (double x : arr) {
            if (x < 0)
                sum += x;
            }
        System.out.println("tổng giá trị âm : " + sum);
    }
}
