/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NganHang;

import java.time.LocalDate;

/**
 *
 * @author Phupham
 */
public class TKKyHan extends TaiKhoan{
    private KyHan tTKyHan;
    private LocalDate ngayDaoHan;

    public TKKyHan(KyHan tTKyHan, LocalDate ngayDaoHan, String soTK, String tenTK, String sDT, String email, double soTien, LocalDate ngayTao) {
        super(soTK, tenTK, sDT, email, soTien, ngayTao);
        this.tTKyHan = tTKyHan;
        this.ngayDaoHan = ngayDaoHan;
    }

    public double getLaiSuat(){
        switch (gettTKyHan()) {

            case MOT_TUAN -> {
                return 0.005;
            }
            case MOT_THANG -> {
                return 0.045;
            }
            case MOT_NAM -> {
                return 0.068;
            }
            default -> throw new AssertionError();
        }
    }

    /**
     * @return the tTKyHan
     */
    public KyHan gettTKyHan() {
        return tTKyHan;
    }

    /**
     * @param tTKyHan the tTKyHan to set
     */
    public void settTKyHan(KyHan tTKyHan) {
        this.tTKyHan = tTKyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

    @Override
    public void thongTin() {
        System.out.println("So tai khoan: "+soTK);
        System.out.println("Ten tai khoan: "+tenTK);
        System.out.printf("So tien: %.3f\n", soTien);
        System.out.println("Loai tai khoan: Co ky han");
        System.out.println("Ky han: "+this.tTKyHan);
        System.out.println("Ngay dao han: "+this.ngayDaoHan);
    }

    @Override
    public void nopTien(double soTien, LocalDate ngay) {
        if(ngay.equals(ngayDaoHan))
          this.soTien+=soTien;
        else
            System.out.println("Chi duoc nop tien vao ngay dao han");
    }

    @Override
    public void rutTien(double soTien, LocalDate ngay) {
        if(ngay.equals(ngayDaoHan))
            if(this.soTien>=soTien){
                this.soTien-=soTien;
                System.out.println("Tai khoan bi tat toan, chuyen sang khong ky han!");
            }else
                System.out.println("Tai khoan cua ban khong du tien de rut!");
        else
            System.out.println("Chi duoc rut tien vao ngay dao han!");
    }

    @Override
    public void tinhLai(LocalDate ngay) {
        if(ngay.equals(ngayDaoHan)){
            double lai=soTien*getLaiSuat();
            soTien+=lai;
        }
    }
    
    public void capNhatNgayMoi(LocalDate ngayMoi){
        this.ngayDaoHan=ngayMoi;
    }
}
