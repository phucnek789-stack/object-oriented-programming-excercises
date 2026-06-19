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
public class Bai15 {
    //Tim nhung so chia het cho 3 tu 10 den 50
    public static void main(String[] args) {
        System.out.println("Nhung so chia het cho 3 la: ");
        for(int i=10;i<=50;i++){
            if(i%3==0)
                System.out.print(i+" ");
        }
        System.out.println("");
    }
}
