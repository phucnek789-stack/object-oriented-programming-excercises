/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author Phupham
 */
public class Bai22 {
    /*Cho chuoi: a="Toi cham hoc toi chiu kho toi dep zai"
      Dem tu toi trong chuoi tren
    */
    public static void main(String[] args) {
        String a = "toi cham hoc toi chiu kho toi dep zai";
        
        String[] tu = a.split(" ");
        
        int count = 0;
        for(String x: tu)
            if(x.equals("toi"))
                count++;
        
        System.out.println("So lan 'toi' trong chuoi a la: "+count);
    }
}
