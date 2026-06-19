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
public abstract class TaiKhoan {
    protected String soTK;
    protected String tenTK;
    protected String sDT;
    protected String email;
    protected double soTien;
    protected LocalDate ngayTao;
    protected boolean trangThai = true;

    public TaiKhoan(String soTK, String tenTK, String sDT, String email, double soTien, LocalDate ngayTao) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.sDT = sDT;
        this.email = email;
        this.soTien = soTien;
        this.ngayTao = ngayTao;
    }

    public abstract void thongTin();
    public abstract void nopTien(double soTien, LocalDate ngay);
    public abstract void rutTien(double soTien, LocalDate ngay);
    public abstract void tinhLai(LocalDate ngay);
    
    /**
     * @return the soTK
     */
    public String getSoTK() {
        return soTK;
    }

    /**
     * @return the tenTK
     */
    public String getTenTK() {
        return tenTK;
    }
}
