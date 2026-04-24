public class bai141ciaosoft {
    public static int vtduongnhonhat(double[] a) {
        double min = Double.MAX_VALUE;
        int vt = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] < min) {
                min = a[i];
                vt = i;
            }
        }
        return vt;
    }
    public static void main(String[] args) {
        double[] a = {2.5, -3.1, 4.2, 1.2};
        int kq = vtduongnhonhat(a);
        System.out.println("Vị trí số dương nhỏ nhất: " + kq);
    }
}
