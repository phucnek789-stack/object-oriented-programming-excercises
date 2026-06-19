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
public class Bai23 {
    /*Viet ct tach so va chu tu chuoi nhap vao thanh 2 chuoi:
    vd nhap vao abc123 se tach va in thanh 2 chuoi abc va 123
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chuoi goc: ");
        String input = sc.nextLine();
        
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();
        
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isDigit(c))
                so.append(c);
            else if(Character.isLetter(c))
                chuoi.append(c);
        }
        
        System.out.print("Chuoi ky tu la: "+chuoi+"\n");
        System.out.print("Chuoi ky tu la: "+so+"\n");
    }
}
