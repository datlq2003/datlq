import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("\n===== QUẢN LÝ TUYỂN SINH =====");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị danh sách thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.print("Nhập số báo danh: ");
                    String sbd = sc.nextLine();

                    System.out.print("Nhập họ tên: ");
                    String hoTen = sc.nextLine();

                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = sc.nextLine();

                    System.out.print("Nhập mức ưu tiên: ");
                    int uuTien = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập khối thi (A/B/C): ");
                    String khoi = sc.nextLine();

                    ThiSinh ts = null;

                    if (khoi.equalsIgnoreCase("A")) {
                        ts = new KhoiA(sbd, hoTen, diaChi, uuTien);
                    } else if (khoi.equalsIgnoreCase("B")) {
                        ts = new KhoiB(sbd, hoTen, diaChi, uuTien);
                    } else if (khoi.equalsIgnoreCase("C")) {
                        ts = new KhoiC(sbd, hoTen, diaChi, uuTien);
                    } else {
                        System.out.println("Khối không hợp lệ!");
                    }
                    if (ts != null) {
                        tuyenSinh.themThiSinh(ts);
                        System.out.println("Thêm thí sinh thành công!");
                    }
                    break;
                case 2:
                    tuyenSinh.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhập số báo danh cần tìm: ");
                    String timSBD = sc.nextLine();
                    tuyenSinh.timKiemTheoSBD(timSBD);
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}


