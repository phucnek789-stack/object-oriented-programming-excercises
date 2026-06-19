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
public class Bai17 {
    /*Tim so hoan hao. vd 6 = 1+2+3
    So hoan hao la so ma tong cac uoc thuc cua no bang chinh no
    Tim cac so hoan hao trong pham vi tu 1 -> 1000
    */
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Nhap so can kiem tra: ");
        n = sc.nextInt();
        int tong = 0;
        
        for(int i=1;i<n;i++)
            if(n%i==0)
                tong+=i;
        if(tong==n)
            System.out.println(n+" la so hoan hao!");
        else
            System.out.println(n+" khong la so hoan hao!");
        */
        for(int n=1;n<=1000;n++){
            int tong = 0;
            for(int i=1;i<n;i++)
                if(n%i==0)
                    tong+=i;
            if(tong==n)
                System.out.println(n+" la so hoan hao!");
        }
        
    }
}
