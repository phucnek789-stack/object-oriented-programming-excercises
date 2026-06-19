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
public class TKKoKyHan extends TaiKhoan{
    private static final double LAI_SUAT=0.001;
    public TKKoKyHan(String soTK, String tenTK, String sDT, String email, double soTien, LocalDate ngayTao) {
        super(soTK, tenTK, sDT, email, soTien, ngayTao);
        
    }
    
    
    @Override
    public void thongTin() {
        System.out.println("So tai khoan: "+soTK);
        System.out.println("Ten tai khoan: "+tenTK);
        System.out.printf("So tien: %.3f\n",soTien);
        System.out.println("Loai tai khoan: Khong ky han");
    }

    @Override
    public void nopTien(double soTien, LocalDate ngay) {
        this.soTien+=soTien;
    }

    @Override
    public void rutTien(double soTien, LocalDate ngay) {
        if(this.soTien>=soTien)
            this.soTien-=soTien;
        else
            System.out.println("Tai khoan cua ban khong du de thuc hien giao dich!");
    }

    @Override
    public void tinhLai(LocalDate ngay) {
        double lai=soTien*LAI_SUAT;
        soTien+=lai;
    }
    
}
