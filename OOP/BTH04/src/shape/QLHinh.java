/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Phupham
 */
public class QLHinh {
    private List<Hinh> ds = new ArrayList<>();
    
    //PT them hinh vao ds
    public void themHinh(Hinh... a){
        this.getDs().addAll(Arrays.asList(a));
    }
    
    //PT xoa hinh khoi ds dua vao ten
    public void xoaHinh(String kw){
        this.ds.removeIf(h->h.getTen().contains(kw));
    }
    
    //PT hien thi thong tin ds
    public void hienThi(){
        this.getDs().forEach(h->System.out.println(h));
    }
    
    //PT lay ds cua 1 loai hinh cu the
    public List<Hinh> locDS(String tenLop) throws ClassNotFoundException{
        Class c = Class.forName(tenLop);
        return this.ds.stream().filter(h->c.isInstance(h)).collect(Collectors.toList());
    }
    
    //PT sap xep ds giam dan theo dt
    public void sapXepTheoDT(){
        this.ds.sort((h1, h2)->Double.compare(h2.tinhDienTich(), h1.tinhDienTich()));      
    }

    //PT sap xep ds tang dan theo ten va neu cung ten thi giam dan theo dt
    public void sapXepTheoTen(){
        this.ds.sort(Comparator.comparing(Hinh::getTen).
                thenComparing(
                        Comparator.comparing(Hinh::tinhDienTich).reversed()
                )
        );
    }
    
    //PT tinh dt tb tat ca cac hinh trong ds
    public double tinhDTTB(){
        return this.ds.stream()
                .mapToDouble(Hinh::tinhDienTich)
                .average()
                .orElse(0);
    }
    
    public int timHinh(Hinh h) {
        return this.ds.indexOf(h);
    }
    
    /**
     * @return the ds
     */
    public List<Hinh> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }
    
    
}
