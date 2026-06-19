/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

/**
 *
 * @author Phupham
 */
public class DemoV3 {
    public static void main(String[] args) {
        Hinh h1 = new HinhChuNhat("HCN", 15.5, 5.8);
        Hinh h2 = new HinhVuong("HV", 4.5);
        Hinh h3 = new HinhChuNhat("HCN", 6.25, 4.5);
        Hinh h4 = new HinhTron("HT", 3.5);
        Hinh h5 = new Ellipse("El", 4, 2.5);
        Hinh h6 = new TamGiac("TG", 2, 3, 4);
        Hinh h7 = new TamGiacCan("TGC", 5, 3);
        Hinh h8 = new TamGiacDeu("TGD", 6);
        
        QLHinh qlh = new QLHinh();
        qlh.themHinh(h1, h7, h8, h4, h6, h5, h2, h3);
        qlh.hienThi();
        
        System.out.println("-------------DANH SACH SAU KHI LOC-------------");
        try {
            qlh.locDS("shape.TamGiac").forEach(h->System.out.println(h));
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        
//        System.out.println("-------------DS SAU KHI SAP XEP GIAM DAN THEO DT-------------");
//        qlh.sapXepTheoDT();
//        qlh.hienThi();
//        
//        System.out.println("-------------DS SAU KHI SAP XEP TANG DAN THEO TEN VA NEU CUNG TEN THI GIAM DAN THEO DT-------------");
//        qlh.sapXepTheoTen();
//        qlh.hienThi();
        
        System.out.println("-------------TONG DT TB CUA CAC HINH TRONG DS-------------");
        System.out.printf("Dien tich trung binh cua chung la: %.2f\n", qlh.tinhDTTB());
        
        System.out.println("-------------VI TRI CUA HINH TRONG DS-------------");
        int idx = qlh.timHinh(new HinhVuong("HV", 4.5));
        System.out.println(idx);
        
    }
}
