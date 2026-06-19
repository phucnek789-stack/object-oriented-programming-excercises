/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toado;

/**
 *
 * @author Phupham
 */
public class DemoV1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====Bai1=====");
        Diem d1 = new Diem(10, 15);
        Diem d2 = new Diem(-8, 12);
        
        d1.hienThi();
        d2.hienThi();
        System.out.println("");
        double kc = d1.tinhKhoangCach(d2);
        System.out.println("Khoang cach giua hai diem la: "+kc);
        
        System.out.println("=====Bai2=====");
        DoanThang dt = new DoanThang(d1, d2);
        dt.hienThi();
        System.out.printf("\nDo dai cua doan thang la: %.1f\n", dt.tinhDoDai());
        System.out.print("Trung diem cua doan thang la: ");
        dt.timTrungDiem().hienThi();
        DoanThang dd1 = new DoanThang(new Diem(1,0), new Diem(0,1));
        DoanThang dd2 = new DoanThang(new Diem(2,0), new Diem(0,2));
        System.out.println("\nHai doan thang dd1 va dd2 co song song khong? => "+dd1.isSongSong(dd2));
        
        System.out.println("=====Bai3=====");
        HinhChuNhat hcn = new HinhChuNhat(new Diem(7,10), new Diem(9,6));
        System.out.println("Dien tich hinh chu nhat la: "+hcn.tinhDienTich());
        System.out.println("Chu vi hinh chu nhat la: "+hcn.tinhChuVi());
        
         System.out.println("=====Bai4=====");
         HinhTron ht = new HinhTron(new Diem(15,14), 7);
         System.out.println("Dien tich hinh tron la: "+ht.tinhDienTich());
         System.out.println("Chu vi hinh tron la: "+ht.tinhChuVi());
         ht.xacDinhVTDiem(new Diem (10,8));
         HinhTron ht2 = new HinhTron(new Diem(2,-6), 5);
         ht.xacDinhVTHinhTron(ht2); 
    }
    
}
