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
public class Bai21 {
    /*Viet ct truyen tin nhan theo mat ma theo bang: 
    a="abcdefghijklmnopqrstuvwxyz"
    b="zxcvbnmasdfghjklqwertyuiop"
    */
    public static void main(String[] args) {
        
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tin nhan can ma hoa: ");
        String input = sc.nextLine();
        
        String output = "";
        
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            int index = a.indexOf(c);
            if(index==-1)
                output+=c;
            else
                output+=b.charAt(index);
        }
        System.out.println("Tin nhan sau khi ma hoa la: "+output);
    }
}
