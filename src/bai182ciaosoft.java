public class bai182ciaosoft {
    public static void lietKe(double[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            boolean traiDau = false;
            if (i > 0 && a[i] * a[i - 1] < 0) {
                traiDau = true;
            }
            if (i < a.length - 1 && a[i] * a[i + 1] < 0) {
                traiDau = true;
            }

            if (traiDau) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co gia tri thoa dieu kien");
        }
    }

    public static void main(String[] args) {
        double[] a = {2, -3, 4, 5, -6, 7};
        lietKe(a);
    }
}
