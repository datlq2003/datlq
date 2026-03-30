import java.util.Scanner;

public class bai58ciaosoft {
    public class bai57ciaosoft {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập n: ");
            int n = sc.nextInt();
            int temp = n;
            boolean toansochan = false;
            while (temp>0){
                int chuso = temp%10;
                if (chuso%2==0){
                    toansochan = true;
                }temp/=10;
            }if (toansochan){
                System.out.println(n+"toàn số chẵn");
            }else {
                System.out.println(n+ "không phải toàn số chẵn");
            }
        }
    }
}
