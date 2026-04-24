public class bai186ciaosoft {
    public static void lietKe(double[] a) {
        double amDauTien = 0;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                amDauTien = a[i];
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong co gia tri am");
            return;
        }
        System.out.print("Cac vi tri: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == amDauTien) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        double[] a = {1.5, -2.0, 3.4, -2.0, 5.6, -7.8, -2.0};
        lietKe(a);
    }
}
