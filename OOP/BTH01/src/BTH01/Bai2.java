/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH01;

import java.util.Scanner;

/**
 *
 * @author Phupham
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap bac n: ");
        int n = sc.nextInt();
        System.out.print("Nhap co so x: ");
        double x = sc.nextDouble();
        
        double gt=0;
        for(int i=0;i<=n;i++){
            System.out.printf("a[%d] = ", i);
            double a = sc.nextDouble();
            gt+=a*Math.pow(x, i);
        }
        System.out.printf("Gia tri cua da thuc = %.1f\n", gt);
        //System.out.printf(String format, Object... args);
        /*Ky hieu                 Kieu du lieu                         Vi du in ra
            %d                  so nguyen (int, long)                   Tuoi: 18
            %f                  so thuc (float, double)                 Diem: 8.50
            %.nf                so thuc voi n chu so sau dau phay       %.1f → 8.5
            %s                  chuoi (String)                          Ten: Nam
            %c                  ky tu (char)                            Ky tu: A
            %n                  ky tu xuong dong (thay cho \n)          Tuy he dieu hanh
            %e                  so thuc dang khoa hoc                   1.23e+03
        */
    }
}
