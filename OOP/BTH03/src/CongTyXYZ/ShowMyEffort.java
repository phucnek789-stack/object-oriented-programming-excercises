/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

import java.util.Scanner;

/**
 *
 * @author Phupham
 */
public class ShowMyEffort {
    public static void main(String[] args) {
        QLNhanVien qlnv = new QLNhanVien();
        
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. Them nhan vien.");
            System.out.println("2. Xoa nhan vien.");
            System.out.println("3. Tra cuu nhan vien.");
            System.out.println("4. Hien thi danh sach nhan vien.");
            System.out.println("5. Tinh luong nhan vien.");
            System.out.println("6. Thoat.");
            System.out.print("Moi nhap lua chon: ");
            
            chon=sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1 -> qlnv.themNV();
                case 2 -> qlnv.xoaNV();
                case 3 -> qlnv.traCuuCanCuoc();
                case 4 -> qlnv.hienThi();
                case 5 -> qlnv.tinhLuong();
                case 6 -> System.out.println("Thoat chuong trinh thanh cong!");
                default -> throw new AssertionError();
            }
        }while(chon!=6);
 
    }
}
