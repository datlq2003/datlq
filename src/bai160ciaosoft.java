public class bai160ciaosoft {
    public static double timGiaTri(double[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < 0 && a[i] > -1) {
                return a[i]; // giá trị cuối cùng thỏa điều kiện
            }
        }
        return 0; // không có
    }

    public static void main(String[] args) {
        double[] a = {2.5, -3, -0.5, 4, -0.2, -5};

        double kq = timGiaTri(a);

        System.out.println("Ket qua: " + kq);
    }
}
