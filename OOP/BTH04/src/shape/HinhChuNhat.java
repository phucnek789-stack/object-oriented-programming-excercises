/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Phupham
 */
public class HinhChuNhat extends Hinh{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.getChieuDai()*this.getChieuRong();
    }

    @Override
    public double tinhChuVi() {
        return (this.getChieuDai()+this.getChieuRong())*2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HinhChuNhat h){
            return super.equals(obj) && Double.compare(this.getChieuDai(), h.getChieuDai()) == 0 && Double.compare(this.getChieuRong(), h.getChieuRong()) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.getChieuDai()) ^ (Double.doubleToLongBits(this.getChieuDai()) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.getChieuRong()) ^ (Double.doubleToLongBits(this.getChieuRong()) >>> 32));
        return hash;
    }

    /**
     * @return the chieuDai
     */
    public double getChieuDai() {
        return chieuDai;
    }

    /**
     * @return the chieuRong
     */
    public double getChieuRong() {
        return chieuRong;
    }

    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
}
