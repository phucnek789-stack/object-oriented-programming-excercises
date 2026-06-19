/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toado;

/**
 *
 * @author Phupham
 */
public class HinhChuNhat {
    private Diem trenTrai;
    private Diem duoiPhai;
    
    //Phuong thuc khoi tao 2 tham so
    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if(trenTrai.getHoanhDo()<duoiPhai.getHoanhDo() && trenTrai.getTungDo()>duoiPhai.getTungDo()){
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        }
        else
            throw new Exception("Du lieu khong hop le!");
    }

    //Phuong thuc tinh dien tich hcn
    public double tinhDienTich(){
        double c = this.trenTrai.getTungDo()-this.duoiPhai.getTungDo();
        double d = this.duoiPhai.getHoanhDo()-this.trenTrai.getHoanhDo();
        return c*d;
    }
    
    //Phuong thuc tinh chu vi hcn
    public double tinhChuVi(){
        double c = this.trenTrai.getTungDo()-this.duoiPhai.getTungDo();
        double d = this.duoiPhai.getHoanhDo()-this.trenTrai.getHoanhDo();
        return (c+d)*2;
    }
    
    //Cac phuong thuc lay gia tri (getter) va thiet lap gia tri (setter)
    /**
     * @return the trenTrai
     */
    public Diem getTrenTrai() {
        return trenTrai;
    }

    /**
     * @param trenTrai the trenTrai to set
     */
    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    /**
     * @return the duoiPhai
     */
    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    /**
     * @param duoiPhai the duoiPhai to set
     */
    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }
    
    
}
