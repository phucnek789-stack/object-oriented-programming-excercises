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
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*//Kiem tra tinh chan le theo toan tu 3 ngoi
        System.out.print("Moi nhap so nguyen n: ");
        int n = sc.nextInt();       
        String answer = (n%2==0)?"Chan!":"Le!";
        System.out.println("=> "+n+" la so "+answer);*/
        
        //Xep loai hoc luc cua hoc sinh theo toan tu 3 ngoi
        System.out.print("Nhap diem trung binh: ");
        double dtb = sc.nextDouble();
        
        if(dtb<0||dtb>10)
            System.out.println("Diem khong hop le!");
        else{
            String xepLoai = (dtb>=8)?"Gioi":
                ((dtb<8&&dtb>=6.5)?"Kha":
                ((dtb<6.5&&dtb>=5)?"Trung binh":"Yeu"));
            System.out.println("=>Hoc sinh co diem trung binh la: "+dtb+" => Xep loai "+xepLoai);
        }   
    }
}
