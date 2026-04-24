import java.util.Scanner;

public class bai122ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i <n; i++) {
            System.out.println("nhập arr [" + i + "] = ");
            arr[i] = sc.nextDouble();
        }
        double max = timgiatrilonnhat(arr, n);
        System.out.println("giá trị lớn nhất trong mảng là : " + max);
    }
    public static double timgiatrilonnhat (double[] a,int n){
            double max = a[0];
            for (int i=1;i<n;i++){
                if (a[i]>max){
                    max = a[i];
                }
            } return max;
    }
}
