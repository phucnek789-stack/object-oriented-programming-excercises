/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Phupham
 */
public class QLSanPham {
    private List<SanPham> ds = new ArrayList<>();

    //PT Nhap them sp vao ds
    public void themSP(SanPham... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    //PT xoa sp khoi ds (bang id)
    public void xoaSP(int id){
        this.ds.removeIf(h->h.getId()==id);
    }
    
    //PT xuat thong tin sp
    public void hienThi(){
        this.ds.forEach((var h)->{
            h.hienThi();
        });
    }
    
    //PT tim kiem thong tin sp thong qua ten, mo ta, ngay phat hanh sp, loai sp (sach hoac bang dia)
    public SanPham timKiem(int id){
        return this.ds.stream().filter(h->h.getId()==id).findFirst().get();
    }
    public List<SanPham> timKiem(String str){
        try {
            Class c = Class.forName(str);
            return this.ds.stream().filter(h->c.isInstance(h)).collect(Collectors.toList());
        } catch (ClassNotFoundException ex) {
            return this.ds.stream().filter(h->h.getTenSP().contains(str)).collect(Collectors.toList());
        }
    }
    
    //PT sap xep ds giam gian theo gia
    public void sapXepGia(){
        this.ds.sort((h1,h2)->Double.compare(h2.getGia(), h1.getGia()));
    }
    
    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
}
