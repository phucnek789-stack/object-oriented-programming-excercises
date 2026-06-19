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
public class Bai20 {
    /*Viet ct kiem tra tinh hop le cua mk: aaaaaAAAAA1
    - mk chua it nhat 6 ky tu
    - chua it nhat 1 chu cai (thuong hay hoa deu duoc)
    - chua it nhat 1 chu so
    Cho nguoi dung nhap vao mk de login / so sanh, neu dung thi mo cua, sai qua 5 lan khoa dang nhap, thoat mk
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        while(true){
            System.out.println("Let set new password:");
            System.out.print("Enter your new password: ");
            String newPassword = sc.nextLine();
            if(checkPW(newPassword)){
                password = newPassword;
                System.out.println("Password set successfully!");
                break;
            }else
                System.out.println("Password setup failed");
        }
        int count = 0;
        String login = "";
        while(true){
            System.out.print("login: ");
            login = sc.nextLine();
            if(login.equals(password)){
                System.out.println("Login successfully!");
                break;
            }
            else{
                System.out.println("Login failed! Please login again!");
                count++;
            }
            if(count==6){
                 System.out.println("You logged in incorrectly too many times! You temporarily can't login again.");
                 break;
            }
        }
    }
    
    public static boolean checkPW(String password){
        //Check do dai cua password
        if(password.length()<6)
            return false;
        
        //Check xem password co it nhat 1 chu cai khong?
        boolean hasLetter = false;
        for(char c: password.toCharArray())
            if(Character.isLetter(c)){
                hasLetter = true;
                break;
            }
        if(!hasLetter)
            return false;
        
        //Check xem password co it nhat 1 chu so khong?
        boolean hasDigit = false;
        for(char c: password.toCharArray())
            if(Character.isDigit(c)){
                hasDigit = true;
                break;
            }
        if(!hasDigit)
            return false;
        
        //Neu password co du 3 dieu kien tren thi tra ve true
        return true;
    }
}
