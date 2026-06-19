/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author Phupham
 */
public class Bai19_1 {
    /*Cho String str1 = "English = 78 Science = 83 Math = 68 History = 65"
    1. Tinh tong cac so trong chuoi tren
    2. Tinh trung binh cong
    */
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        String[] a = str1.split("\\ ");
        //Duyet qua tung phan va chuyen no sang kieu so neu co the
        for(String x: a){
            System.out.println(x);
            try{
                //Chuyen chuoi sang so nguyen bang phuong thuc ParsInt() cua lop Integer
                int num = Integer.parseInt(x);
                sum+=num;
                count++;
            }catch(NumberFormatException n){
                //Khong lam gi ca
            }
        }
        //Tinh tong va trung binh cong
        double tbc = (double) sum/count;
        System.out.println("Tong cac so la: "+sum);
        System.out.println("Trung binh cong la: "+tbc);
    }
}
