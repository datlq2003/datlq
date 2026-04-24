public class bai179ciaosoft {
    public static void lietKeThoaDieuKien(double[] a) {
        System.out.print("Cac gia tri thoa dieu kien: ");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > Math.abs(a[i + 1])) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        double[] a = {5.0, -3.0, 2.0, -4.0, 6.0};
        lietKeThoaDieuKien(a);
    }
}

