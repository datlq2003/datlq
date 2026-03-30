import java.util.Scanner;

public class bai31ciaosoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n:");
        int n = sc.nextInt();
        boolean lasonguyento = true;
        if (n<2){
            lasonguyento = false;
        }else {
            for (int i=2;i*i<=n;i++){
                if (n%i==0){
                    lasonguyento=false;
                    break;
                }
            }
        }if (lasonguyento){
            System.out.println(n+ "là số nguyên tố");
        }else {
            System.out.println(n+ "không là số nguyên tố");
        }
    }
}
