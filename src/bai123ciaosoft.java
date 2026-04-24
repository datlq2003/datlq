import java.util.Scanner;

public class bai123ciaosoft {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhập arr = [ " + i + " ] = ");
            arr[i] = sc.nextInt();n
    }*/
        double min = giatrinhonhat(new int[]{}, 5);
        System.out.println("giá trị nhỏ nhất trong mảng là: " + min);
    }

    public static double giatrinhonhat(int[] a, int n) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < n; i++) {
            System.out.println("" + arr[i]);
        }
        for (int i = 1; i <= n + 2; i++) {
            System.out.println(" " + arr[i - 1]);
            if (i == n) {
                break;//i = 1 => i = 1-1
             }
        }return 1.0;
    }
}
