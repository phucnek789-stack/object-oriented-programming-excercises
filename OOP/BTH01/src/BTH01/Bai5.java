/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH01;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Phupham
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Nhap mang
        System.out.print("Nhap so dong: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int n = sc.nextInt();
        int[][] a = new int [m][n];
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j] = (int) (Math.random() * 100); //Cau a
        
        //Xuat mang 
        System.out.println("Mang vua tao la: ");
        for(var row: a){
            for(var x: row)
               System.out.printf("%d\t",x);
            System.out.println("");
        }
        
        //Cau b
        //Tong tung dong
        for(int i=0;i<m;i++){
            System.out.printf("Tong tren dong thu %d la: %d\n", i+1, IntStream.of(a[i]).sum());
        }
        //Tong tung cot
        for(int j=0;j<n;j++){
            int sum = 0;
            for(int i=0;i<m;i++)
                sum += a[i][j];
            System.out.printf("Tong tren cot thu %d la: %d\n", j+1, sum);
        }
        
        //Cau c
        //Dong co tong lon nhat
        int maxR = 0;
        int maxSum = IntStream.of(a[0]).sum();
        for(int i=1;i<m;i++){
            int sum = IntStream.of(a[i]).sum();
            if(sum>maxSum){
                maxSum = sum;
                maxR = i;
            }
        }
        System.out.printf("Dong co tong lon nhat la dong thu %d (Tong = %d)\n", maxR+1, maxSum);
        //Cot co tong nho nhat
        int minSum = 0;
        for(int i=0;i<m;i++)
            minSum += a[i][0]; //tong cot dau tien cho la nho nhat
        
        int minC = 0;
        for(int j=1;j<n;j++){ //xet tong cua cac cot tiep theo
            int sum = 0;
            for(int i=0;i<m;i++)
                sum += a[i][j];
            if(sum<minSum){
                minSum = sum;
                minC = j;
            }
        }
        System.out.printf("Cot co tong nho nhat la cot thu %d (Tong = %d)\n", minC+1, minSum);
    }
}
