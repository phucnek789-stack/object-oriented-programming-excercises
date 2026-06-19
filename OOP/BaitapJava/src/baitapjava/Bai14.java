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
public class Bai14 {
    //Tinh tong cac so le tu 1 den n, bo qua ko cong tong voi so 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        int tong = 0;
        
        if(n%2!=0){
            for(int i=1;i<=n;i+=2){
                if(i==3) continue; //break
                tong+=i;
            }
            System.out.println("Tong cac le la: "+tong);
        }
        else
            System.out.println("Day la so chan, thoat!");
    }
}
