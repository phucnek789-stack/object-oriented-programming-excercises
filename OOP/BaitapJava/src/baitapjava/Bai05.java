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
public class Bai05 {
    public static void main(String[] args) {
         //Viet ct nhap vao can nang va chieu cao, tinh BMI va xuat ra thong bao
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu cao: ");
        float height = sc.nextFloat();
        System.out.print("Nhap chieu can nang: ");
        float weight = sc.nextFloat();
        
        float BMI = (float) (weight/Math.pow(height, 2)); //Math chi tra ve double
        System.out.println("BMI: "+BMI);
        
        if(BMI<15)
            System.out.println("Than hinh qua gay");
        else if(BMI>=15 && BMI <16)
            System.out.println("Than hinh gay");
        else if(BMI>=16 && BMI<18.5)
            System.out.println("Than hinh hoi gay");
        else if(BMI>=18.5 && BMI<25)
            System.out.println("Than hinh binh thuong");
        else if(BMI>=25 && BMI<30)
            System.out.println("Than hinh hoi beo");
        else if(BMI>=30 && BMI<35)
            System.out.println("Than hinh beo");
        else 
            System.out.println("Than hinh qua beo");
    }
}
