/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Phupham
 */
public class DSPhanSo {
    private final List<PhanSo> ds = new ArrayList<>();
    public void themPS(PhanSo p){
        ds.add(p);
    }
    
    public void themPS(PhanSo ...p){
        ds.addAll(Arrays.asList(p));
    }
    
    public PhanSo cong(){
//        PhanSo temp= new PhanSo();
//        for(var x: ds)
//            temp=temp.cong(x);
//        return temp;
        return ds.stream().reduce(new PhanSo(), (t, x) -> t.cong(x)).rutGon();
    }
    
    public PhanSo timMax(){
//        PhanSo max = new PhanSo();
//        for(var x: ds)
//            if(max.soSanh(x)!=1)
//                max=x;
//        return max;
    return ds.stream().max((p1, p2) -> p1.soSanh(p2)).get();
    }
    
    public void hienThi(){
        //for(var x: ds) x.hienThi();
        ds.forEach(x -> x.hienThi());
    }
    
    public boolean xoaPS(PhanSo p){
        return ds.remove(p);
    }
    
    public void sapXep(PhanSo ...p){
        ds.addAll(Arrays.asList(p));
        ds.sort((a, b) -> a.soSanh(b));
    }
}

