public class bai143ciaosoft {
    public static int chandau (int[] a,int n){
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                return a[i];
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 7, 5, 6};
        int n = a.length;
        int kq = chandau(a, n);
        if (kq == -1) {
            System.out.println("" + kq);
        } else {
            System.out.println("" + kq);
        }
    }
}
