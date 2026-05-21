import java.util.ArrayList;

class TuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();
    public void themThiSinh(ThiSinh ts) {
        danhSachThiSinh.add(ts);
    }
    public void hienThiDanhSach() {
        if (danhSachThiSinh.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (ThiSinh ts : danhSachThiSinh) {
            System.out.println("----------------------");
            ts.hienThiThongTin();
        }
    }
    public void timKiemTheoSBD(String sbd) {
        boolean timThay = false;
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
                System.out.println("Thông tin thí sinh:");
                ts.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy thí sinh!");
        }
    }
}

