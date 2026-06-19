/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Phupham
 */
public class TamGiac extends Hinh{
    private double a,b,c;

    public TamGiac(String ten, double a, double b, double c) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double tinhDienTich() {
        double p=tinhChuVi()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double tinhChuVi() {
        return (a+b+c);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TamGiac h){
            return super.equals(obj) && Double.compare(this.a, h.a) == 0 && Double.compare(this.b, h.b) == 0 && Double.compare(this.c, h.c) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.c) ^ (Double.doubleToLongBits(this.c) >>> 32));
        return hash;
    }
}
