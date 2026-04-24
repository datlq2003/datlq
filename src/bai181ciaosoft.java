public class bai181ciaosoft {
    public static void lietKe(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                boolean coLanCanChan = false;
                if (i > 0 && a[i - 1] % 2 == 0) {
                    coLanCanChan = true;
                }
                if (i < a.length - 1 && a[i + 1] % 2 == 0) {
                    coLanCanChan = true;
                }
                if (coLanCanChan) {
                    System.out.print(a[i] + " ");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Khong co gia tri thoa dieu kien");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 3, 8, 10, 5};

        lietKe(a);
    }
}
