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
public class tinhDiemTB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap diem toan: ");
        float toan = sc.nextFloat();
        System.out.print("Nhap diem ly: ");
        float ly = sc.nextFloat();
        System.out.print("Nhap diem hoa: ");
        float hoa = sc.nextFloat();
        
        float dtb=(toan*2+ly+hoa)/4;
        System.out.printf("Diem trung binh = %.1f\n", dtb);
        
        if(dtb<0||dtb>10)
            System.out.println("Khong co loai diem nay!");
        else{
            if(dtb>=9)
            System.out.println("Xep loai xuat sac");
        else if(dtb>=8&&dtb<10)
            System.out.println("Xep loai gioi");
        else if(dtb>=6.5)
            System.out.println("Xep loai kha");
        else if(dtb>=5)
            System.out.println("Xep loai trung binh");
        else if(dtb>=3.5)
            System.out.println("Xep loai yeu");
        else
            System.out.println("Xep loai kem");
        }
    }
}
