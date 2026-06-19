/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author Phupham
 */
public class PhanSo {
    private int tu;
    private int mau;
    
    public PhanSo(){
        tu = 0;
        mau = 1;
    }
    public PhanSo(int t){
        tu = t;
        mau = 1;
    }
    public PhanSo(int t, int m){
        tu = t;
        mau = m;
    }
    public PhanSo cong(PhanSo ps){
        int tuMoi = tu*ps.mau+mau*ps.tu;
        int mauMoi =mau*ps.mau;
        return new PhanSo(tuMoi,mauMoi);
    }
    public void hienThi(){
        System.out.printf("%d/%d ", tu, mau);
    }
    
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(1);
        PhanSo p2 = new PhanSo(2,3);
        PhanSo[] a = {p1,p2};
        PhanSo t = new PhanSo();
        for(PhanSo x: a)
            t=t.cong(x);
        t.hienThi();
    }
}
