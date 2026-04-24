public class bai187ciaosoft {
    public static void lietKe(double[] a) {
        double minDuong = Double.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] < minDuong) {
                minDuong = a[i];
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co gia tri duong");
            return;
        }
        System.out.print("Cac vi tri: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == minDuong) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        double[] a = {3.5, -2, 1.2, 4.8, 1.2, -5};
        lietKe(a);
    }
}
