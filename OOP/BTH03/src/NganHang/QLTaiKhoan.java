/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NganHang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Phupham
 */
public class QLTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    private static int dem=1;
    
    public String taoSoTK(){
        return String.format("%05d", dem++);
    }
    
    public void themTK(TaiKhoan... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public TaiKhoan timTheoSo(String so){
        return this.ds.stream().filter(h->h.getSoTK().equals(so)).findFirst().orElse(null);
    }
    
    public List<TaiKhoan> timTheoTen(String ten){
        return this.ds.stream().filter(h->h.getTenTK().equalsIgnoreCase(ten)).collect(Collectors.toList());
    }
    
    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
    
}
