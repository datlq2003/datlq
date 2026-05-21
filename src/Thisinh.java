abstract class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected int mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }
    public String getSoBaoDanh() {
        return soBaoDanh;
    }
    public abstract String getKhoi();
    public void hienThiThongTin() {
        System.out.println("SBD: " + soBaoDanh);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Mức ưu tiên: " + mucUuTien);
        System.out.println("Khối thi: " + getKhoi());
    }
}

