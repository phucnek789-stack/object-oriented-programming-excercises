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
public class Bai18 {
    /*Viet ct nhap vao so nguyen a>0, cho biet do co phai so nguyen to ko?
    (so nguyen to la so >1, chia het cho 1 va chinh no)
    Ket thuc ct hoi ng dung: Ban co muon tiep tuc sd phan mem ko? 
    Neu chon ko thi thoat ct
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("Nhap vao 1 so nguyen a: ");
        a = sc.nextInt();
        
        while(a<=0){
            System.out.println("Moi ban nhap lai, a>0 moi dung");
            a = sc.nextInt();
        }
        System.out.println("Ban da nhap a thanh cong, a = "+a);
        
        //Kiem tra xem a co phai so ngto (so ngto la so chi co 2 uoc)
        int demUoc = 0;
        for(int i=1;i<=a;i++)
            if(a%i==0)
                demUoc++;
        if(demUoc==2)
            System.out.println(a+" la so nguyen to!");
        else
            System.out.println(a+" khong phai la so nguyen to!");
        
        System.out.println("Ban co muon thoat chuong trinh khong? (chon x de thoat)");
        String answer = new Scanner(System.in).nextLine();
        if(answer.equals("x") || answer.equals("X"))
            break;
        }
    }
}
