public class bai172ciaosoft {
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int bcnn(int a, int b) {
        return a * b / ucln(a, b);
    }
    public static int bcnnMang(int[] a) {
        int kq = a[0];
        for (int i = 1; i < a.length; i++) {
            kq = bcnn(kq, a[i]);
        }
        return kq;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int kq = bcnnMang(a);
        System.out.println(" " + kq);
    }
}
