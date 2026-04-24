public class bai168ciaosoft {
    public static int timGiaTri(int[] a) {
        int max = 0;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                if (!found || a[i] > max) {
                    max = a[i];
                    found = true;
                }
            }
        }
        return found ? max : 0;
    }

    public static void main(String[] args) {
        int[] a = {12, 25, 30, 7, 45, 11};
        int kq = timGiaTri(a);
        System.out.println("Ket qua: " + kq);
    }
}
