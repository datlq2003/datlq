public class bai196ciaosoft {
    public static void lietKe(double[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Khong co so am");
        }
    }

    public static void main(String[] args) {
        double[] a = {3.5, -2.1, 4.0, -7.3, 0, 5.2};
        lietKe(a);
    }
}
