/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany;

/**
 *
 * @author Phupham
 */
public abstract class SanPham {
    private static int dem;
    private int id=++dem;
    private String tenSP;
    private String moTa;
    private String nSX;
    private double gia;

    public SanPham(String tenSP, String moTa, String nSX, double gia) {
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.nSX = nSX;
        this.gia = gia;
    }

    public void hienThi() {
        System.out.printf(
            "ID: %d\nTen san pham: %s\nMo ta: %s\nNha san xuat: %s\nGia ban: %.3f\n",
            this.id,
            this.tenSP,
            this.moTa,
            this.nSX,
            this.gia
        );
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
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    /**
     * @return the nSX
     */
    public String getnSX() {
        return nSX;
    }

    /**
     * @param nSX the nSX to set
     */
    public void setnSX(String nSX) {
        this.nSX = nSX;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    } 
}
