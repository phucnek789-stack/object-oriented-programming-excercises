/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toado;

/**
 *
 * @author Phupham
 */
public class HinhTron {
    private Diem tam;
    private double bk;

    //Phuong thuc khoi tao tam va bk
    public HinhTron(Diem tam, double bk) {
        this.tam = tam;
        this.bk = bk;
    }

    //Phuong thuc tinh dien tich hinh tron
    public double tinhDienTich(){
        return Math.PI*Math.pow(this.bk, 2);
    }
    
    //Phuong thuc tinh chu vi hinh tron
    public double tinhChuVi(){
        return 2*Math.PI*this.bk;
    }
    
    //Phuong thuc xac dinh vi tri tuong doi cua 1 diem voi hinh tron
    public double xDVTTDDiemHinhTron(Diem d){
        double kc = this.tam.tinhKhoangCach(d);
        return Double.compare(this.bk, kc);
    }
    
    public void xacDinhVTDiem(Diem d){
        double kq = xDVTTDDiemHinhTron(d);
        if(kq>0)
            System.out.println("Diem nam ben trong duong tron.");
        else if(kq==0)
            System.out.println("Diem nam tren duong tron.");
        else
            System.out.println("Diem nam ben ngoai duong tron.");   
    }
    
    public double xDVTTDHinhTronHinhTron(HinhTron ht){
        double kc = this.tam.tinhKhoangCach(ht.tam);
        double tbk = this.bk + ht.bk;
        return Double.compare(tbk, kc);
    }
    
    public void xacDinhVTHinhTron(HinhTron ht){
        double kq = xDVTTDHinhTronHinhTron(ht);
        if(kq>0)
            System.out.println("Hai duong tron cat nhau hoac tiep xuc trong.");
        else if(kq==0)
            System.out.println("Hai duong tron tiep xuc ngoai.");
        else
            System.out.println("Hai duong tron roi nhau."); 
    }
    
    //Cac phuong thuc lay gia tri (getter) va thiet lap gia tri (setter)
    /**
     * @return the tam
     */
    public Diem getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(Diem tam) {
        this.tam = tam;
    }

    /**
     * @return the bk
     */
    public double getBk() {
        return bk;
    }

    /**
     * @param bk the bk to set
     */
    public void setBk(double bk) {
        this.bk = bk;
    } 
}
