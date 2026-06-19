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
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        int tong = 0;
        if(a%2==0){
            for(int i=0;i<=a;i+=2){
                tong+=i;
            }
            System.out.println("Tong cac so chan la: "+tong);
        }
        else
            System.out.println("Toi khong tinh tong so le, bye bye!");
    }
 
}
