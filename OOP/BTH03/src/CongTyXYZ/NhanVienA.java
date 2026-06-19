/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

/**
 *
 * @author Phupham
 */
public class NhanVienA extends NhanVien{

    public NhanVienA(String cccd, String ten, String que, String gioiTinh, String sDT) {
        super(cccd, ten, que, gioiTinh, sDT);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return 1.2*LUONG*soNgayCong;
    }

    @Override
    public String tenBoPhan() {
        return "Bo phan A";
    }   
}
