/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Phupham
 */
public class Ellipse extends Hinh{
    private double trucLon;
    private double trucNho;

    public Ellipse(String ten, double trucLon, double trucNho) {
        super(ten);
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }

    

    @Override
    public double tinhDienTich() {
        return this.trucLon*this.trucNho*Math.PI;
    }

    @Override
    public double tinhChuVi(){
        return 2*Math.PI*Math.sqrt((this.trucLon*this.trucLon+this.trucNho*this.trucNho)/2);
    } 
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ellipse h){
            return super.equals(obj) && Double.compare(this.trucLon, h.trucLon) == 0 && Double.compare(this.trucNho, h.trucNho) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.trucLon) ^ (Double.doubleToLongBits(this.trucLon) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.trucNho) ^ (Double.doubleToLongBits(this.trucNho) >>> 32));
        return hash;
    }
}
