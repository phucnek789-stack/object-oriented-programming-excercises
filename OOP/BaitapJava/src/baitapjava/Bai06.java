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
public class Bai06 {
    public static void main(String[] args) {
        //Kiem tra nam nhuan
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();
        
        if(nam%4==0 && nam%100!=0 || nam%400==0)
            System.out.println("Nam "+nam+" la nam nhuan!");
        else
            System.out.println("Nam " +nam+ " la nam khong nhuan!");
    }
}
