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
public class Bai09 {
    public static void main(String[] args) {
        //Viet ct nhap thang cho biet thang do thuoc quy may
        Scanner sc = new Scanner(System.in);
        
        byte thang;

        do{
            System.out.print("Moi nhap thang: ");
            thang = sc.nextByte(); 
        
            switch (thang) {
            case 1, 2, 3 -> System.out.println("Thang "+thang+" thuoc quy 1");
            case 4, 5, 6 -> System.out.println("Thang "+thang+" thuoc quy 2");
            case 7, 8, 9 -> System.out.println("Thang "+thang+" thuoc quy 3");
            case 10, 11, 12 -> System.out.println("Thang "+thang+" thuoc quy 4");
            case 0 -> System.out.println("Thoat chuong trinh thanh cong! Hen gap lai ban!");
            default -> System.out.println("Khong hop le! Moi nhap lai");
            }
        }while(thang!=0);
 
    }
}
