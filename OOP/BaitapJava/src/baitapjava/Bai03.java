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
public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen bat ki: ");
        int n = sc.nextInt();
        
        //Kiem tra so chan hoac so le
        if(n%2==0)
            System.out.println(n+" la so chan!");
        else
            System.out.println(n+" la so le!");
        
        //Tinh giai thua
        long gt = 1;
        for(int i=1;i<=n;i++){
            gt*=i;
        }
        System.out.println("Giai thua cua "+n+" la: "+gt);
        
        //In day fibonacci
        int f1=0, f2=1;
        System.out.print("Day fibonacci: ");
        
        for(int i=1;i<=n;i++){
            System.out.print(f1+" ");
            int next=f1+f2;
            f1=f2;
            f2=next;
        }
        System.out.println("");
        
        //In bang cuu chuong
        for(int i=2;i<=9;i++){
            System.out.println("=====BANG CUU CHUONG "+i+"=====");
            for(int j=1;j<=10;j++)
                System.out.println(i+" x "+j+" = "+(i*j));
            System.out.println("");
        }
    }
}
