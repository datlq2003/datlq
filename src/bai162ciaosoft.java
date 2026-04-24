public class bai162ciaosoft {
    public static int timViTri(double[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == a[i - 1] * a[i + 1]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        double[] a = {2, 6, 3, 4, 5};
        int kq = timViTri(a);
        System.out.println("Vi tri: " + kq);
    }
}
