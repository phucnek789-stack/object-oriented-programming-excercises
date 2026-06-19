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
public class PTBac2 {
    public static void main(String[] args) {
        String kq = GiaiPTBac2(1, 2, 3);
        String kq2 = GiaiPTBac2(1, 2, 1);
        String kq3 = GiaiPTBac2(1, 2, -3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);
        
        //cho nguoi dung nhap vao tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao so c: ");
        double c = sc.nextDouble();
        String kq4 = GiaiPTBac2(a, b, c);
        System.out.println(kq4);
    }
    
    //Ham giai pt bac 2
    public static String GiaiPTBac2(double a, double b, double c){
        //Neu a=0 thi pt tro thanh ptbn: bx+c=0
        if(a==0){
            if(b==0&&c==0)
                return "Phuong trinh co vo so nghiem!";
            else if(b==0&&c!=0)
                return "Phuong trinh vo nghiem!";
            else
                return "Phuong trinh co nghiem: "+(-c/b);
        }
        //ptb2
        else{
             double delta = (b*b)-(4*a*c);
             if(delta<0)
                 return "Phuong trinh vo nghiem!";
             else if(delta==0){
                 double x = (-b)/(2*a);
                 return "Phuong trinh co nghiem kep: x = "+x;
             }
             else{
                 double x1 = (-b+Math.sqrt(delta))/(2*a);
                 double x2 = (-b-Math.sqrt(delta))/(2*a);
                 return "Phuong trinh co 2 nhiem phan biet: x1 = "+x1+"; x2 = "+x2;
             }
        }
    }
}
