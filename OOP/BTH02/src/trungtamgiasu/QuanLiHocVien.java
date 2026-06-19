/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trungtamgiasu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Phupham
 */
public class QuanLiHocVien {
    private List<HocVien> ds = new ArrayList<>();

    //PT them HV
    public void themHv(HocVien... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    //PT them va doc hoc vien tu tap tien hocvien.txt 
    public void themHv(String tapTin) throws FileNotFoundException{
        File f = new File(tapTin);
        try(Scanner sc = new Scanner(f)){
            while (sc.hasNext()){
                this.ds.add(new HocVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
        }
    }
    
    //PT hien thi ds hoc vien
    public void hienThi(){
        this.ds.forEach(h->h.hienThi());
    }
    
    //PT Nhap diem cho hoc vien
    public void nhapDiem(){
        this.ds.forEach(h -> {
            System.out.printf("-----TEN HV: %s-----\n", h.getHoTen().toUpperCase());
            h.nhapDiem();
        });
    }
    
    //PT kiem HV bang ma HV
    public HocVien timKiem(int id){
        return this.ds.stream().filter(h->h.getId()==id).findFirst().get();
    }
    //PT kiem cac HV bang ten HV hoac ki tu trong ten cac HV
    public List<HocVien> timKiem(String kw){
        return this.ds.stream().filter(h->h.getHoTen().contains(kw)).collect(Collectors.toList());
    }
    
    //PT kiem cac HV co hoc bong
    public List<HocVien> timKiem(){
        return this.ds.stream().filter(h->h.isHocBong()).collect(Collectors.toList());
    }
    //PT xac dinh ds HV de trao hoc bong. Xuat ds do ra 1 tap tin ten la hocbong.txt
    public void xuatDS(String taptin) throws FileNotFoundException{
        File f = new File(taptin);
        try(PrintWriter w = new PrintWriter(f)){
            this.timKiem().forEach(h->w.printf("%d - %s - %.1f\n",h.getId() ,h.getHoTen(), h.tinhTb()));
        }  
    }
    
    //PT sap xep hv giam dan theo diem cac mon
    public void sapXepTheoDiem(){
        ds.sort((h1, h2)->
        Double.compare(h2.tinhTb(), h1.tinhTb())
        );
    }
    
    //PT thong ke do tuoi
    public void tKDoTuoi(){
        long nhoHon18=ds.stream().filter(h->h.tinhTuoi()<18).count();
        long tu18Den23=ds.stream().filter(h->h.tinhTuoi()>=18 && h.tinhTuoi()<=23).count();
        long tu24TroLen=ds.stream().filter(h->h.tinhTuoi()>24).count();
        
        System.out.println("Thong ke do tuoi:");
        System.out.printf(" - Nho hon 18: %d hoc vien\n", nhoHon18);
        System.out.printf(" - Tu 18 den 23: %d hoc vien\n", tu18Den23);
        System.out.printf(" - Tu 24 tro len: %d hoc vien\n", tu24TroLen);
    }
    
    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
}
