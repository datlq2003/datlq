public class bai201ciaosoft {
    public static double tongDuong(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
