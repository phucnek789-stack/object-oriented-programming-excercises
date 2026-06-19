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
public class Bai08 {
    public static void main(String[] args) {
        //Tinh delta
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao he so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao he so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao he so c: ");
        double c = sc.nextDouble();
        
        double delta = Math.pow(b, 2) - 4*a*c;
        System.out.println("delta = "+delta);
        
        if(delta<0)
            System.out.println("Phuong trinh vo nghiem");
        else if(delta==0){
             System.out.println("Phuong trinh co 2 nghiem kep: ");
             double x = -b/(2*a);
             System.out.println("x1 = x2 = "+x)   ;
        }         
        else{//delta>0
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            double x1 = (-b-Math.sqrt(delta))/(2*a);
            double x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }   
}
