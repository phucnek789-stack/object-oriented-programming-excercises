/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Phupham
 */
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        //cau a
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Nhap email: ");
        String s = sc.nextLine();
        System.out.print("Chuoi sau khi duoc cat la: ");
        System.out.println(s.substring(0, s.indexOf("@")));
        
        //cau b
        int c = 0;
        for(int i=0;i<s.length();i++)
            if(Character.isUpperCase(s.charAt(i))==true)
                c++;
        System.out.print("So ki tu hoa: ");
        System.out.println(c);*/
        
        //cau c
        File f = new File("input.txt");
        try(Scanner sc = new Scanner(f)){
            while(sc.hasNext()){
                 String s = sc.nextLine();
                 s = s.replaceAll("\\{file\\}", "Tap tin");
                 System.out.println(s);
                    
            }
        }
        
        //cau d
        String g = "I ; ,; wANt; ;; ,,  tO; ;;   imProve  ;;,,;  mY    ;;,, JAVA     ;,;; skiLLS";
        String[] a = g.trim().split("[\\s,;]+");
        System.out.println("So tu trong xau la: "+a.length);
        String max="";
        for(var x: a)
            if(x.length()>max.length())
                max = x;
        System.out.println("Tu dai nhat trong chuoi la: "+max);
        
        //cau e
        StringBuilder b = new StringBuilder();
        for(var x: a)
            b.append(x.substring(0, 1).toUpperCase()).append(x.substring(1).toLowerCase()).append(" ");
        System.out.println("Chuoi sau khi duoc chuan hoa la: "+b.toString());
    }
}
