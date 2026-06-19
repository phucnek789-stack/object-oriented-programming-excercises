/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

/**
 *
 * @author Phupham
 */
public class NhanVienD extends NhanVien{
    private double phuCap;

    public NhanVienD(String cccd, String ten, String que, String gioiTinh, String sDT, double phuCap) {
        super(cccd, ten, que, gioiTinh, sDT);
        this.phuCap=phuCap;
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return LUONG*soNgayCong+phuCap;
    }

    /**
     * @return the phuCap
     */
    public double getPhuCap() {
        return phuCap;
    }

    /**
     * @param phuCap the phuCap to set
     */
    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public String tenBoPhan() {
        return "Bo phan D";
    }
}
