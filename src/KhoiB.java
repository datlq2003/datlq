class KhoiB extends ThiSinh {
    public KhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String getKhoi() {
        return "B (Toán, Hoá, Sinh)";
    }
}
