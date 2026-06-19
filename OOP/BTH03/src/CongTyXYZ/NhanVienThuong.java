/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

/**
 *
 * @author Phupham
 */
public class NhanVienThuong extends NhanVien{

    public NhanVienThuong(String cccd, String ten, String que, String gioiTinh, String sDT) {
        super(cccd, ten, que, gioiTinh, sDT);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return LUONG*soNgayCong;
    }

    @Override
    public String tenBoPhan() {
        return "Bo phan thuong";
    }
}
