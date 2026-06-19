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
public class DemKyTu {
    /*Nhap vao 1 chuoi tu ban phim:
    dem xem co bao nhieu kt thuong, kt hoa, so, khoang cach
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chuoi: ");
        String s = sc.nextLine();
        
        int demSo=0;
        int demThuong=0;
        int demHoa=0;
        int demSpace=0;
        
        System.out.println("Do dai chuoi la: "+s.length());
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
                demThuong++;
            else if(Character.isUpperCase(c))
                demHoa++;
            else if(Character.isDigit(c))
                demSo++;
            else if(Character.isWhitespace(c))
                demSpace++;
            else
                System.out.println("Ky tu khong hop le!");
        }
        System.out.println("Co "+demThuong+" ky tu in thuong.");
        System.out.println("Co "+demHoa+" ky tu in hoa.");
        System.out.println("Co "+demSo+" chu so.");
        System.out.println("Co "+demSpace+" khoang trang.");
    }
}
