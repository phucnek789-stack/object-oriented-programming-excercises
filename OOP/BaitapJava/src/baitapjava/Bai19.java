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
public class Bai19 {
    /*Viet ct nhap vao 2 so a,b tu ban phim
    Nhap 1 ky tu +,-,*,/
    Dung function
    1. Neu nhap + : Tinh a+b va in ra ket qua
    2. Neu nhap - : Tinh a-b va in ra ket qua
    2. Neu nhap * : Tinh a*b va in ra ket qua
    2. Neu nhap / + Tinh a/b va in ra ket qua (chu y ktra mau so khac 0)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        
        //Khai bao scanner rieng cho string
        Scanner scString = new Scanner(System.in);
        System.out.print("Moi chon phep tinh(+,-,*,/): ");
        String phepTinh = scString.nextLine();
        
        switch(phepTinh){
            case "+": 
                Cong(a, b);
                break;
            case "-":
                Tru(a, b);
                break;
            case "*":
                Nhan(a, b);
                break;
            case "/":
                Chia(a, b);
                break;
            default:
                System.out.println("Phep tinh khong hop le!");
        }
    }
    
    //Ham cong
    public static void Cong(double a, double b){
        double kq = a + b;
        System.out.println(kq);
    }
    
     //Ham tru
    public static void Tru(double a, double b){
        double kq = a - b;
        System.out.println(kq);
    }
    
     //Ham nhan
    public static void Nhan(double a, double b){
        double kq = a * b;
        System.out.println(kq);
    }
    
     //Ham chia
    public static void Chia(double a, double b){
        if(b==0)
            System.out.println("Khong the chia duoc! (b phai khac 0)");
        else{
                double kq = a / b;
        System.out.println(kq);
                }
        
    }
}