public class bai173ciaosoft {
    public static int timChuSo(int[] mang) {
        int[] dem = new int[10];
        for (int phanTu : mang) {
            int so = Math.abs(phanTu);
            if (so == 0) {
                dem[0]++;
            }
            while (so > 0) {
                int chuSo = so % 10;
                dem[chuSo]++;
                so = so / 10;
            }
        }
        int itNhat = Integer.MAX_VALUE;
        int ketQua = 0;

        for (int i = 0; i <= 9; i++) {
            if (dem[i] > 0 && dem[i] < itNhat) {
                itNhat = dem[i];
                ketQua = i;
            }
        }
        return ketQua;
    }
    public static void main(String[] args) {
        int[] mang = {29, 504, 13};
        int ketQua = timChuSo(mang);
        System.out.println("Chu so xuat hien it nhat: " + ketQua);
    }
}
