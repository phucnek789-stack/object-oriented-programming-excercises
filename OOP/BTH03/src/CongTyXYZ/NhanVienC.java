/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

/**
 *
 * @author Phupham
 */
public class NhanVienC extends NhanVien{

    public NhanVienC(String cccd, String ten, String que, String gioiTinh, String sDT) {
        super(cccd, ten, que, gioiTinh, sDT);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return 2.5*LUONG*soNgayCong;
    }

    @Override
    public String tenBoPhan() {
        return "Bo phan C";
    }
}
