/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany;

/**
 *
 * @author Phupham
 */
public class BangDia extends SanPham{
    private double tGPhat;
    public BangDia(String tenSP, String moTa, String nSX, double gia, double tGPhat) {
        super(tenSP, moTa, nSX, gia);
        this.tGPhat = tGPhat;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Thoi gian phat: %.1f\n", this.tGPhat);
    }

    /**
     * @return the tGPhat
     */
    public double gettGPhat() {
        return tGPhat;
    }

    /**
     * @param tGPhat the tGPhat to set
     */
    public void settGPhat(double tGPhat) {
        this.tGPhat = tGPhat;
    }
}
