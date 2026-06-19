/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Phupham
 */
public class MangCoBan {
    public static void main(String[] args) {
//        //Xuat, nhat mang
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap so luong phan tu: ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        
//        for(int i=0;i<n;i++){
//            System.out.print("a["+i+"] = ");
//            a[i] = sc.nextInt();
//        }
//        
//        System.out.println("Mang vua nhap la: ");
//        System.out.println(Arrays.toString(a));
        
        //Sap sep tang dan
        int[] a1 = new int[]{8,9,12,48,1,2,3};
        Arrays.sort(a1);
        System.out.println("Mang sau khi sap xep tang dan la: ");
        System.out.println(Arrays.toString(a1));
        
        //Dao nguoc mang
        int[] a2 = new int[]{1,10,3,9,5};
        for(int i=0,j=a2.length-1;i<j;i++,j--){
            int temp = a2[i];
            a2[i] = a2[j];
            a2[j] = temp;
        }
        System.out.println("Mang sau khi dao nguoc la: ");
        System.out.println(Arrays.toString(a2));
    }
}
