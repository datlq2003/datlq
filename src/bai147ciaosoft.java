public class bai147ciaosoft {
    public static double duongcuoi(double[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > 0) {
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        double[] a = {2.5, -3.1, 4.2, -5.6};
        double kq = duongcuoi(a);
        if (kq == -1) {
            System.out.println("Không có số dương.");
        } else {
            System.out.println("Số dương cuối cùng là: " + kq);
        }
    }
}
