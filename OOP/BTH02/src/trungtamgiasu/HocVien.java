/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trungtamgiasu;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.DoubleStream;

/**
 *
 * @author Phupham
 */
public class HocVien {
    private static int dem=0;
    private int id =++dem;
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;
    private double[] diem;

    public HocVien(String hoTen, LocalDate ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
    
    public HocVien(String hoTen, String ngaySinh, String queQuan){
        this(hoTen, LocalDate.parse(ngaySinh, CauHinh.FORMATTER), queQuan);
     }
     
    public void hienThi(){
        System.out.printf("Id: %d\nHo va ten: %s\nNgay sinh: %s\nQue quan: %s\n",
                this.id, this.hoTen, this.ngaySinh.format(CauHinh.FORMATTER), this.queQuan);
        if(this.diem!=null){
            System.out.print("Diem cac mon: ");
            for(var x: this.diem)
                System.out.printf("%.1f\t", x);
            System.out.println("");
        }
     }
     
    public void nhapDiem(){
        this.diem = new double[CauHinh.SO_MON];
        for(int i=0;i<CauHinh.SO_MON;i++){
            System.out.printf("Nhap diem mon thu %d: ", i+1);
            this.diem[i]=CauHinh.SC.nextDouble();
        }
    }
     
    public double tinhTb(){
        if(this.diem!=null)
            return DoubleStream.of(this.diem).average().getAsDouble();
        return 0;
    }
    
    public boolean isHocBong(){
        if(this.diem!=null){
            for(var x: this.diem)
                if(x<5)
                    return false;
            return this.tinhTb()>=8;
        }
        return false;
    }
    
    public int tinhTuoi(){
        return Period.between(ngaySinh, LocalDate.now()).getYears();
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}
