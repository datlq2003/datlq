public class bai194ciaosoft {
    public static void lietKe(int[] a) {
        int n = a.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(a[i] - a[j]);
                if (diff < min) {
                    min = diff;
                }
            }
        }
        System.out.println("Cac cap gan nhau nhat:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) == min) {
                    System.out.println(a[i] + " - " + a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 9, 1, 7, 3};
        lietKe(a);
    }
}
