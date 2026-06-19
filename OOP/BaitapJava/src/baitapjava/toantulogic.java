/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author Phupham
 */
public class toantulogic {
    public static void main(String[] args) {
        int i = 15;
        System.out.println(i>0&&i<10);
        System.out.println(i>10||i<-1);
        System.out.println(!(i>10||i<-1));
        
        int x=100;
        int y=90;
        int z=80;
        int t=70;
        
        x++;
        ++y;
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
        
        int a=1;
        int b=2;
        int c=a++ - ++b +1; //1 - 3 + 1 do (++b) b duoc tang truoc roi tinh toan xong moi tang a (a++) 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }  
}
