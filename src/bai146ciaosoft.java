public class bai146ciaosoft {
    public static double amdau(double[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return a[i];
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        double[] a = {2.5, 3.1, -4.2, 5.6};
        double kq = amdau(a);
        if (kq == 1) {
            System.out.println("Không có số âm.");
        } else {
            System.out.println("Số âm đầu tiên là: " + kq);
        }
    }
}
