/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author Phucpham
 */
public class Bai02 {
//    Tinh chu vi, dien tich hinh tron
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ban kinh r: ");
        double r = sc.nextDouble();
        
        double cv = 2*Math.PI*r;
        System.out.printf("Chu vi cua hinh tron la: %.2f\n", cv);
        
        double dt = Math.PI*Math.pow(r, 2); 
        System.out.printf("Dien tich cua hinh tron la: %.2f\n", dt);
    }
}
