/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

/**
 *
 * @author Phupham
 */
public class NhanVienB extends NhanVien{

    public NhanVienB(String cccd, String ten, String que, String gioiTinh, String sDT) {
        super(cccd, ten, que, gioiTinh, sDT);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return 1.5*LUONG*soNgayCong;
    }

    @Override
    public String tenBoPhan() {
        return "Bo phan B";
    } 
}
