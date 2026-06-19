/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NganHang;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Phupham
 */
public class MyDemo {
    public static void main(String[] args) {
        QLTaiKhoan qltk = new QLTaiKhoan();
        
        TaiKhoan tk1 = new TKKoKyHan(qltk.taoSoTK(), "FucPhamss", "0383759335", "Phucnek789@gmail.com", 150.000, LocalDate.now());
        TaiKhoan tk2 = new TKKyHan(KyHan.MOT_THANG, LocalDate.now().plusDays(7), qltk.taoSoTK(), "Huy Phuc", "027573576473", "Phuc@ou.edu.vn", 215.000, LocalDate.now());
        
        qltk.themTK(tk1, tk2);
        
        System.out.println("=====DANH SACH TAI KHOAN=====");
        qltk.getDs().forEach(TaiKhoan::thongTin);
        
        System.out.println("=====TIM THEO SO=====");
        TaiKhoan tkTim=qltk.timTheoSo("00001");
        if(tkTim!=null)
            tkTim.thongTin();
        else
            System.out.println("Khong tim that tai khoan!");
        
        System.out.println("=====TIM THEO TEN=====");
        List<TaiKhoan> dsTen=qltk.timTheoTen("Huy Phuc");
        dsTen.forEach(TaiKhoan::thongTin);
        
        System.out.println("=====NOP TIEN=====");
        tk1.nopTien(100.000, LocalDate.now());
        tk1.thongTin();
        
        System.out.println("=====RUT TIEN=====");
        tk2.rutTien(123.000, LocalDate.now().plusDays(7));
        tk2.thongTin();
        
        System.out.println("=====NGAY DAO HAN=====");
        LocalDate ngayDaoHan=LocalDate.now().plusDays(7);
        
        tk2.tinhLai(ngayDaoHan);
        tk2.nopTien(120.000, ngayDaoHan);
        tk2.rutTien(123.000, ngayDaoHan);
        tk2.thongTin();
    }
}
