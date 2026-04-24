import java.util.Arrays;

public class bai175ciaosoft {
    public static void gannhaunhat(double[] a) {
        int n = a.length;
        Arrays.sort(a);
        double min = Math.abs(a[1] - a[0]);
        double x = a[0];
        double y = a[1];
        for (int i = 2; i < n; i++) {
            double hieu = Math.abs(a[i] - a[i - 1]);
            if (hieu < min) {
                min = hieu;
                x = a[i - 1];
                y = a[i];
            }
        }
        System.out.println("Hai so gan nhau nhat: " + x + " va " + y);
    }
    public static void main(String[] args) {
        double[] a = {7.5, 2.9, 10.0, 3.1};
        gannhaunhat(a);
    }
}
