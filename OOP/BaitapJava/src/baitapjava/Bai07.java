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
public class Bai07 {
    public static void main(String[] args) {
        //Kiem tra so ngay trong thang
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap thang: ");
        byte thang = sc.nextByte();
        
        if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12)
            System.out.println("Thang "+thang+" co 31 ngay!");
        else if(thang == 4 || thang == 6 || thang == 9 || thang == 11)
            System.out.println("Thang "+thang+" co 30 ngay");
        else if(thang == 2){
            System.out.print("Nhap nam: ");
            int nam = sc.nextInt();
            if(nam%4==0 && nam%100!=0 || nam%400==0)
                System.out.println("Nam "+nam+" la nam nhuan nen thang 2 co 29 ngay!");
            else
                System.out.println("Nam "+nam+" la nam khong nhuan nen thang 2 co 28 ngay!");
        }
        else
            System.out.println("Thang vua nhap khong hop le!");
    }
}
