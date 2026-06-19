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
public class Bai04 {
    public static void main(String[] args) {
        //Tinh x, y khi biet tong va hieu
        Scanner sc = new Scanner(System.in);       
        
        System.out.print("Nhap tong 2 so: ");
        float tong = sc.nextFloat();
        System.out.print("Nhap hieu 2 so: ");
        float hieu = sc.nextFloat();
        
        float x = (tong+hieu)/2;
        float y = tong-x;
        
        System.out.printf("Gia tri x la: %.1f\n", x);
        System.out.printf("Gia tri y la: %.1f\n", y);
    }
}
