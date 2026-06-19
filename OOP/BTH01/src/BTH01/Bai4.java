/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH01;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Phupham
 */
public class Bai4 {
    public static int[] NhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu de tao mang: ");
        n = sc.nextInt();
        int[] a = new int[n];
 
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void XuatMang(int[] a) {
            //Xuat mang
        System.out.println("Mang vua nhap la: ");
        System.out.println(Arrays.toString(a));
    }
    
    public static boolean isSoNguyenTo(int x){
        if(x < 2)
            return false;
        for(int i=2;i<=Math.sqrt(x);i++)
            if(x%i==0)
                return false;
        return true;
    }
    
    public static void main(String[] args) {
        int n = 0;
        int[] a = NhapMang(n);
        
        XuatMang(a);
    
        //Cau a. Cach 1
//        int tong = 0;
//        for(var x: a)
//            if(isSoNguyenTo(x))
//                tong+=x;
//        System.out.print("Tong cac so nguyen to la: "+tong);
        //Cach 2
        System.out.print("Tong cac so nguyen to la: ");
        System.out.println(IntStream.of(a).filter(x->isSoNguyenTo(x)).sum());
        
        //Cau b
        OptionalInt maxDuong = IntStream.of(a).filter(x->x>0).max();
        OptionalInt minAm = IntStream.of(a).filter(x->x<0).min();
        
        System.out.print("So duong lon nhat la: ");
        System.out.println(maxDuong.isPresent() ? maxDuong.getAsInt():"*");
        
        System.out.print("So am nho nhat la: ");
        System.out.println(minAm.isPresent() ? minAm.getAsInt() : "*");
        
        //Cau c
        OptionalInt minNT = IntStream.of(a).filter(x->isSoNguyenTo(x)).min();
        if(minNT.isPresent())
            System.out.println("So nguyen to nho nhat trong mang la: "+minNT.getAsInt());
        else
            System.out.println("Khong co so nguyen to nho nhat trong mang!");
        
        //Cau d
        int[] a1 = IntStream.of(a).filter(x->isSoNguyenTo(x)).sorted().toArray();
        int viTri = 0;
        for(int i=0;i<a.length;i++)
            if(isSoNguyenTo(a[i]))
                a[i] = a1[viTri++];
        System.out.println("Sap xep cac so nguyen to tang dan, cac so con lai giu nguyen vi tri: "+Arrays.toString(a));
        
        //Cau e
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();
      
        int pos = -1;
        for(int i=0;i<a.length;i++)
            if(a[i]==x){
                pos = i;
                break;
            }
        if(pos!=-1)
            System.out.println("Vi tri cua "+x+" trong mang la: "+pos);
        else
            System.out.println("Khong tim thay "+x+" trong mang!");
    }
}
