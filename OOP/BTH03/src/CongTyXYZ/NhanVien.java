/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

/**
 *
 * @author Phupham
 */
public abstract class NhanVien {
    private static int dem;
    private int id=++dem;
    private String ten;
    private String cccd;
    private String que;
    private String gioiTinh;
    private String sDT;
    
    public static final double LUONG=100000;

    public NhanVien(String ten, String cccd, String que, String gioiTinh, String sDT) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
        this.gioiTinh = gioiTinh;
        this.sDT = sDT;
    }

    public abstract double tinhLuong(int soNgayCong);
    public abstract String tenBoPhan();
    
    @Override
    public String toString(){
        return String.format(
        "ID: %d | Ho ten: %s | CCCD: %s | Gioi tinh: %s | Que quan: %s | SDT: %s | Bo phan: %s",
        id, ten, cccd, gioiTinh, que, sDT, tenBoPhan());
    }
    
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cccd
     */
    public String getCccd() {
        return cccd;
    }

    /**
     * @param cccd the cccd to set
     */
    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the que
     */
    public String getQue() {
        return que;
    }

    /**
     * @param que the que to set
     */
    public void setQue(String que) {
        this.que = que;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the sDT
     */
    public String getsDT() {
        return sDT;
    }

    /**
     * @param sDT the sDT to set
     */
    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    
}
