/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author Phupham
 */
public class Bai01 {
//    lam quen voi Scanner va phep nhap/xuat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String ten = sc.nextLine();
        System.out.println("Ten cua ban la: "+ten);
        
        System.out.print("Nhap gioi tinh: ");
        String gt = sc.nextLine();
        System.out.println("Gioi tinh cua ban la: "+gt);
        
        System.out.print("Nhap chieu cao: ");
        float cao = sc.nextFloat();
        System.out.println("Chieu cao cua ban la: "+cao);
    }
}
