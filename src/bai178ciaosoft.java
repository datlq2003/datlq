public class bai178ciaosoft {
    public static void lietKeChanTrongDoan(int[] a, int x, int y) {
        System.out.print("Cac so chan trong doan [" + x + ", " + y + "]: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] >= x && a[i] <= y) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 10, 12, 15, 8};
        int x = 5;
        int y = 12;
        lietKeChanTrongDoan(a, x, y);
    }
}
