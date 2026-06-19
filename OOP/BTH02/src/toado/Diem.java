/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toado;

/**
 *
 * @author Phupham
 */
public class Diem {
    private double hoanhDo;
    private double tungDo;
    
    //Phuong thuc khoi tao 2 tham so
    public Diem(double hoanhDo, double tungDo) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }
    
    //Phuong thuc hien thi thong tin 1 diem
    public void hienThi(){
        System.out.printf("(%.1f, %.1f)", this.hoanhDo, this.tungDo);
    }
    
    //Phuong thuc tinh khoang cach giua 2 diem
    public double tinhKhoangCach(Diem d){
        return Math.sqrt(Math.pow(this.hoanhDo - d.hoanhDo, 2) + Math.pow(this.tungDo - d.tungDo, 2));
    }
    
    //Cac phuong thuc lay gia tri (getter) va thiet lap gia tri (setter)
    /**
     * @return the doanhDo
     */
    public double getHoanhDo() {
        return hoanhDo;
    }

    /**
     * @param hoanhDo
     */
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    /**
     * @return the tungDo
     */
    public double getTungDo() {
        return tungDo;
    }

    /**
     * @param tungDo the tungDo to set
     */
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    
    
}
