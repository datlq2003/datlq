public class bai148ciaosoft {
    public static boolean isPrime(int n){
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }return true;
    }
    public  static int nguyentocuoi(int[] a){
        for (int i=a.length - 1; i>=0;i--){
            if (isPrime(a[i])){
                return a[i];
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] a =  {2,1,6,5,7,8,4,3};
        int kq= nguyentocuoi(a);
        if (kq==-1){
            System.out.println("" + kq);
        }else {
            System.out.println("" + kq);
        }
    }
}
