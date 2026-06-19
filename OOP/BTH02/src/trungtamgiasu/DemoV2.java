/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trungtamgiasu;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author Phupham
 */
public class DemoV2 {
    public static void main(String[] args) {
        HocVien h1 = new HocVien("Pham Ngoc Huy Phuc", "04/04/2006", "Dong Nai");
        HocVien h2 = new HocVien("Nguyen Phuong Linh", "27/09/2004", "Thanh Hoa");
        HocVien h3 = new HocVien("Nguyen Ngoc Hoang", "01/05/2005", "Ha Noi");
        HocVien h4 = new HocVien("Tran Vu Nhu Quynh", "08/02/2003", "An Giang");
        HocVien h5 = new HocVien("Nguyen Vu Hoang Phuc", LocalDate.of(2005, 11, 22), "Bien Hoa");
        
        QuanLiHocVien qlhv = new QuanLiHocVien();
        //qlhv.themHv(h1, h2, h3, h4, h5);
        try {
            qlhv.themHv("src/trungtamgiasu/resources/hocvien.txt");
        } catch (FileNotFoundException ex) {
            System.getLogger(DemoV2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }   
        qlhv.hienThi();
        
        System.out.println("--------------------------------------");
        qlhv.nhapDiem();
        
        System.out.println("--------------------------------------");
        System.out.println("Ket qua hien thi sau khi nhap ds: ");
        qlhv.hienThi();
        
        System.out.println("--------------------------------------");
        System.out.println("Tim kiem hoc vien theo id: ");
        qlhv.timKiem(10).hienThi();
        
        System.out.println("--------------------------------------");
        System.out.println("Tim kiem hoc vien theo ten hoac ki tu: ");
        qlhv.timKiem("Ma").forEach(h->h.hienThi());
        
        System.out.println("--------------------------------------");
        System.out.println("Danh sach cac hoc vien co hoc bong: ");
        qlhv.timKiem().forEach(h->h.hienThi());
        try {
            qlhv.xuatDS("src/trungtamgiasu/resources/hocbong.txt");
        } catch (FileNotFoundException ex) {
            System.getLogger(DemoV2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Danh sach hoc vien sau khi xep theo diem giam dan la: ");
        qlhv.sapXepTheoDiem();
        qlhv.hienThi();
        
        System.out.println("--------------------------------------");
        qlhv.tKDoTuoi();
    }
}
