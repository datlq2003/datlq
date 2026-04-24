public class bai164ciaosoft {
    public static boolean laSoGanh(int so) {
        int soGoc = so;
        int daoNguoc = 0;
        if (so < 0) return false;
        while (so > 0) {
            int chuSo = so % 10;
            daoNguoc = daoNguoc * 10 + chuSo;
            so = so / 10;
        }
        return soGoc == daoNguoc;
    }
    public static Integer timSoGanhDauTien(int[] mang) {
        for (int phanTu : mang) {
            if (laSoGanh(phanTu)) {
                return phanTu;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] mang = {123, 456, 12321, 789};

        Integer ketQua = timSoGanhDauTien(mang);

        if (ketQua != null) {
            System.out.println("So ganh dau tien: " + ketQua);
        } else {
            System.out.println("Khong co so ganh");
        }
    }
}
