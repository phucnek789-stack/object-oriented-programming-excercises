/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author Phupham
 */
public class StringCoban {
    public static void main(String[] args) {
         String s =" Hoi do toi che em mom rong"+
                "\nToi ko tin 2 dua chop mom dc";
        System.out.println(s);
        
        StringBuilder sb = new StringBuilder();
        
        //Them vao cuoi chuoi
        sb.append("Xin chao");
        sb.append(" minh moi hoc lap trinh");
        sb.append(", rat vinh duoc gap cac ban.");
        System.out.println(sb);
        
        //Chen chuoi (vi tri, chuoi can them)
        sb.insert(0, "minh la Phucnek. ");
        System.out.println(sb);
        
        //Xoa chuoi (start, end-1)
        sb.delete(0, 16);
        System.out.println(sb);
        
        //Tra ve do dai cua chuoi
        System.out.println(sb.length());
        
        //Kiem tra vi tri xuat hien dau tien cua ki tu hoac chuoi, tra ve -1 neu ko tim thay
        String s2 = " toi la ai vay toi? ";
        System.out.println(s2.indexOf("toi"));
        //Kiem tra vi tri xuat hien cuoi cung cua ki tu hoac chuoi, tra ve -1 neu ko tim thay
        System.out.println(s2.lastIndexOf("toi"));
        
        //contains: Kiem tra chuoi con 
        String s3 = ".mp4";
        String s4 = "Nhaccuatui.mp3";
        boolean check = s4.contains(s3);
        if(check)
            System.out.println("Co ton tai .mp3 trong chuoi");
        else
            System.out.println("Khong ton tai .mp3 trong chuoi");
        
        //substrings: Lay chuoi con tu chuoi ban dau
        String s5 = "abcdefghi";
        String s6 = s5.substring(5);
        System.out.println(s5);
        System.out.println(s6);
        
        //replace("old string", "new string"): thay the chuoi
        String s7 = "Hoc, Hoc nua, Hoc mai.";
        String s8 = s7.replace("Hoc", "Ngu");
        System.out.println(s7);
        System.out.println(s8);
        //replaceFirt("old string", "new string"): thay tu dau tien cua chuoi
        String s9 = "Hoc, Hoc nua, Hoc mai.";
        String s10 = s9.replaceFirst("Hoc", "Ngu");
        System.out.println(s9);
        System.out.println(s10);
        
        //trim(): Xoa toan bo khoang trang o dau va cuoi chuoi
        String s11 = "        Ga lai lap trinh      ";
        String s12 = s11.trim();
        System.out.println(s11);
        System.out.println(s12);
        
        //compareTo, compareToIgnoreCase: so sanh 2 chuoi
        /*Bang nhau tra ve 0
        Neu lon hon tra ve>0
        Neu nho hon tra ve<0
        */     
        String s13 = "abc13579";
        String s14 = "abc13579";
        int x = s13.compareTo(s14); //Tra ve  x=0
        System.out.println("x = "+x);
        
        String s15 = "ABC13579";
        String s16 = "abc13579";
        /*A co gia tri 65 trong banh ASCII
        a co gia tri 97 trong banh ASCII
        => 65-97 = -32
        */
        int x2 = s15.compareTo(s16); //Tra ve  x2=-32<0
        System.out.println("x = "+x2);
        
        //So sanh ko pb hoa thuong:
        String s17 = "ABC13579";
        String s18 = "abc13579";
        int x3 = s17.compareToIgnoreCase(s18); //Tra ve  x3=0
        System.out.println("x = "+x3);
        
        //split("\\Dau phan cach"): Tach chuoi
        String s19 = "Turn it all to dust. Not another step";
        String[] a = s19.split("\\. ");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        
        //In thuong tat ca: toLowerCase()
        String s20 = "NO DISTRACTION!";
        String s21 = s20.toLowerCase();
        System.out.println(s21);
        //In hoa tat ca: toUpperCase() 
        String s22 = "adapt or die!";
        String s23 = s22.toUpperCase();
        System.out.println(s23);
        
        //toCharArray(): Tach chuoi thanh tung ky tu, cho vao mang
        String s24 = "Scatter!";
        char[] a2 = s24.toCharArray();
         for(int i=0;i<a2.length;i++)
            System.out.println(a2[i]);
         
         //reverse(): Dao nguoc chuoi
         String s25 = "Back like I never left!";
         //Khai bao doi tuong class StringBuilder
         StringBuilder sb2 =  new StringBuilder(s25);
         sb2.reverse();
         System.out.println(sb2);
    }
}
