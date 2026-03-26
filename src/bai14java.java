import java.util.Scanner;

public class bai14java {
   /* viết phương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím
            1.nhập n = 7, bỏ qua cộng tổng với số 3 => in ra kết quả*/
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("mời nhập số nguyên a : ");
       int n;
       int tong = 0;
       n = sc.nextInt();
       if (n%2!=0){
           for (int i=1;i<=n;i+=2){
               if (i==3)
                   break;
               else {
                   tong +=i;
               }
               System.out.println("tổng các số từ 1 đến "+ n+ "= " +tong);
           }
       }
   }
}
