public class bai174ciaosoft {
    public static void lietKeCap(double[] mang) {
        int n = mang.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                double a = mang[i];
                double b = mang[j];
                if (a <= b) {
                    System.out.println("(" + a + ", " + b + ")");
                }
            }
        }
    }
    public static void main(String[] args) {
        double[] mang = {3.2, 1.5, 4.8};
        lietKeCap(mang);
    }
}
