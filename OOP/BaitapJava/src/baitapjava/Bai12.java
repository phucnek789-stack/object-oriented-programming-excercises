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
public class Bai12 {
    /*Viet ct nhap vao so nguyen n, in ra kq la n!
    C1: Dung vong lap for
    C2: Dung vong lap while
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int gt = 1;
        
        //Cach 1:
        /*for(int i=1;i<=n;i++){
            gt*=i;
        }*/
        
        //Cach 2:
        int i = 1;
        while(i<=n){
            gt*=i;
            i++;
        }
        System.out.println("Giai thua cua "+n+" la: "+gt);
        
    }
}
