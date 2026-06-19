/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author Phupham
 */
public class Bai16 {
      //Tinh tong S=1!+2!+3!+...+10!
    public static void main(String[] args) {
      int n = 1;
      int tong = 0;
      for(int i=1;i<=10;i++){
          n*=i;
          tong+=n;
      }
        System.out.println("S = "+tong);
    }
}
