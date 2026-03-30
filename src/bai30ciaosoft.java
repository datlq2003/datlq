import java.util.Scanner;

public class bai30ciaosoft {
    //Cho số nguyên dương n. Kiểm tra số dương n có phải là số hoàn thiện
    //hay không?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i =1;i<n;i++){
            if (n%i==0){
                sum +=i;
            }
        }if (sum ==n){
            System.out.println(n+"là số hoàn thiện");
        }else {
            System.out.println(n+"không là số hoàn thiện ");
        }
    }
}
