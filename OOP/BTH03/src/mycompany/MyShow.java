/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycompany;

/**
 *
 * @author Phupham
 */
public class MyShow {
    public static void main(String[] args) {
        SanPham sp1 = new Sach("Chainsaw man", "Dinh cao va dien loan", "Tatsuki Fujimoto", 23.200, 152);
        SanPham sp2 = new Sach("Onepiece", "Day cam xuc", "Oda Eiichiro", 25.500, 1324);
        SanPham sp3 = new BangDia("Jujutsu kaisen", "Kich tinh", "Gege", 32.000, 1233.652);
        SanPham sp4 = new Sach("Doraemon", "Tuoi tho va nhan van", "Fujiko F. Fujio", 18.500, 200);
        SanPham sp5 = new BangDia("Naruto Shippuden", "Hanh dong va tinh ban", "Masashi Kishimoto", 20.700, 220.5);
        SanPham sp6 = new Sach("Conan", "Trinh tham gay can", "Aoyama Gosho", 22.000, 350);
        
        QLSanPham qlsp = new QLSanPham();
        
        System.out.println("-----DS BAN DAU-----");
        qlsp.themSP(sp1, sp2, sp3, sp4, sp5, sp6);
        qlsp.hienThi();
        
        System.out.println("-----DS SAU KHI DA XOA MOT VAI SP-----");
        qlsp.xoaSP(4);
        qlsp.xoaSP(6);
        qlsp.hienThi();
        
        System.out.println("-----DS SAU KHI DA LOC CAC SP CUNG LOAI-----"); //cung loai sach hay loai dia
        qlsp.timKiem("mycompany.BangDia").forEach(h->h.hienThi());
        
        System.out.println("-----DS SAU KHI DUOC SX GIAM DAN THEO GIA-----");
        qlsp.sapXepGia();
        qlsp.hienThi();
    }    
}
