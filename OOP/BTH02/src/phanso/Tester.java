/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanso;

/**
 *
 * @author Phupham
 */
public class Tester {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(-2,15);
        PhanSo p2 = new PhanSo(-3,7);
        PhanSo p3 = new PhanSo(5,8);
        PhanSo p4 = new PhanSo(25,24);
        PhanSo p5 = new PhanSo(-24,14);
        
        p1.hienThi();
        p2.rutGon().hienThi();
        
        p1.cong(p2).rutGon().hienThi();
        p1.tru(p2).rutGon().hienThi();
        p1.nhan(p2).rutGon().hienThi();
        p1.chia(p2).rutGon().hienThi();
        
        p1.soSanhPS(p2);
        
        DSPhanSo ds=new DSPhanSo();
        System.out.println("-----DS cac PS-----");
        ds.themPS(p1, p2, p3, p4, p5);
        ds.xoaPS(p1);
        ds.hienThi();
        System.out.println("-----Cong 2 PS trong mang-----");
        ds.cong().hienThi();
        System.out.println("-----PS lon nhat-----");
        ds.timMax().hienThi();
        System.out.println("-----Sap xep-----");
        ds.sapXep();
        ds.hienThi();
    }
}
