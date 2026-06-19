/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTH01;

import java.util.Scanner;

/**
 *
 * @author Phucpham
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = (int) (Math.random()*100);
        
        int doan;
        do{
        System.out.print("Nhap so ma ban doan = ");
        doan = sc.nextInt();
        
        if(doan<n)
            System.out.println("So ban doan nho hon!");
        else if(doan>n)
            System.out.println("So ban doan lon hon!");
        else
            System.out.println("Ban da doan chinh xac!");
        }while(doan!=n);
    }
   
}
