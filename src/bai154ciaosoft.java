public class bai154ciaosoft {
    public static int vtamlonnhat(double[] a) {
        double max = Double.NEGATIVE_INFINITY;
        int vt = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 && a[i] > max) {
                max = a[i];
                vt = i;
            }
        }
        return vt;
    }
    public static void main(String[] args) {
        double[] a = {-5.2, -1.3, -8.0, 2.5};
        int kq = vtamlonnhat(a);
        System.out.println("Vị trí số âm lớn nhất: " + kq);
    }
}
