/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toado;

/**
 *
 * @author Phupham
 */
public class DoanThang {
    private Diem diemDau;
    private Diem diemCuoi;

    //Phuong thuc khoi tao 2 tham so
    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }
    
    //Phuong thuc tinh do dai doan thang
    public double tinhDoDai(){
        return this.diemDau.tinhKhoangCach(diemCuoi);
    }
    
    //Phuong thuc tim trung diem doan thang
    public Diem timTrungDiem(){
        double x = (this.diemDau.getHoanhDo()+this.diemCuoi.getHoanhDo())/2;
        double y = (this.diemDau.getTungDo()+this.diemCuoi.getTungDo())/2;
        return new Diem(x,y);
    }
    
    //Phuong thuc kiem tra 2 doan thang song song
    public boolean isSongSong(DoanThang dt){
        double v1 = (this.diemDau.getHoanhDo()-this.diemCuoi.getHoanhDo())
                *(dt.diemDau.getTungDo()-dt.diemCuoi.getTungDo());
        double v2 = (this.diemDau.getTungDo()-this.diemCuoi.getTungDo())
                *(dt.diemDau.getHoanhDo()-dt.diemCuoi.getHoanhDo());
        return v1==v2;
    }
    
    //Phuong thuc hien thi thong tin doan thang
    public void hienThi(){
        System.out.printf("[(%.1f,%.1f), (%.1f,%.1f)]",
                this.diemDau.getHoanhDo(), this.diemDau.getTungDo(),
                this.diemCuoi.getHoanhDo(), this.diemCuoi.getTungDo());
    }
    
    //Cac phuong thuc lay gia tri (getter) va thiet lap gia tri (setter)
    /**
     * @return the diemDau
     */
    public Diem getDiemDau() {
        return diemDau;
    }

    /**
     * @param diemDau the diemDau to set
     */
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    /**
     * @return the diemCuoi
     */
    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    /**
     * @param diemCuoi the diemCuoi to set
     */
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
    
    
}
