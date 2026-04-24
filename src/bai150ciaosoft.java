public class bai150ciaosoft {
    public static double amlonnhat(double[] a) {
        double max = -1;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (!found || a[i] > max) {
                    max = a[i];
                    found = true;
                }
            }
        }
        if (!found) return 0;
        return max;
    }
    public static void main(String[] args) {
        double[] a = {-5.2, -1.3, -8.0};
        double kq = amlonnhat(a);
        System.out.println(" " + kq);
    }
}
