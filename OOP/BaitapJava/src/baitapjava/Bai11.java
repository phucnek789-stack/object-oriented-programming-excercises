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
public class Bai11 {
    /*Viết chương trình Java cho phép người dùng nhập một ký tự tương ứng với màu đèn giao thông:
      R hoặc r → Red (Đỏ)
      Y hoặc y → Yellow (Vàng)
      G hoặc g → Green (Xanh)
    */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         char light;
         System.out.print("Moi nhap ky tu mau den (G-Y-R): ");
         light = sc.next().charAt(0);
         
         switch(Character.toUpperCase(light)){
             case 'R':
                 System.out.println("Den do: Dung lai!");
                 break;
             case 'Y':
                 System.out.println("Den vang: Chuan bi dung!");
                 break;
             case 'G':
                 System.out.println("Den xanh: Duoc phep di");
                 break;
             default:
                 System.out.println("Khong co loai den nay!");
         }
            
    } 
}
