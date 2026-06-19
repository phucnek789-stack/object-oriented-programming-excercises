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
public class LamQuenMang {
    public static void main(String[] args) {
        String[] mangStr;
        int[] mangNguyen;
        boolean[] mangBool;
        
        String[] mangStr2 = new String[12];
        int[] mangNguyen2 = new int[7];
        
        String[] mangStr3 = new String[]{"Yoru", "Clove", "Viper", "Jett"};
        int[] mangNguyen3 = new int[]{1,2,3,4,5,6,7};
        
        System.out.println(mangNguyen3[4]);
        System.out.println(mangStr3[2]);
        System.out.println(mangStr2[0]);
        
        System.out.println(mangNguyen3.length);
        System.out.println(mangStr3.length);
        
        for(String pt: mangStr3)
            System.out.print(pt+"\t");
        System.out.println("");
    }
}
