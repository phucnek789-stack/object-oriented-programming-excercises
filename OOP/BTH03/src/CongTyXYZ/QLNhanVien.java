/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTyXYZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Phupham
 */
public class QLNhanVien {
    private List<NhanVien> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    
    //PT them nv moi cua 1 bo phan trong ds nv
//    public void themNV(NhanVien... a){
//        this.ds.addAll(Arrays.asList(a));
//    }
    public void themNV() {
    System.out.print("Ho ten: ");
    String hoTen = sc.nextLine();

    System.out.print("CCCD: ");
    String cccd = sc.nextLine();

    System.out.print("Gioi tinh: ");
    String gioiTinh = sc.nextLine();

    System.out.print("Que quan: ");
    String queQuan = sc.nextLine();

    System.out.print("SDT: ");
    String sdt = sc.nextLine();

    System.out.println("Chon bo phan:");
    System.out.println("1. Nhan vien thuong");
    System.out.println("2. Bo phan A");
    System.out.println("3. Bo phan B");
    System.out.println("4. Bo phan C");
    System.out.println("5. Bo phan D");

    int loai = sc.nextInt();
    sc.nextLine(); // clear buffer

    NhanVien nv = null;

    switch (loai) {
        case 1 -> nv = new NhanVienThuong(hoTen, cccd, gioiTinh, queQuan, sdt);
        case 2 -> nv = new NhanVienA(hoTen, cccd, gioiTinh, queQuan, sdt);
        case 3 -> nv = new NhanVienB(hoTen, cccd, gioiTinh, queQuan, sdt);
        case 4 -> nv = new NhanVienC(hoTen, cccd, gioiTinh, queQuan, sdt);
        case 5 -> {
            System.out.print("Nhap phu cap: ");
            double phuCap = sc.nextDouble();
            nv = new NhanVienD(hoTen, cccd, gioiTinh, queQuan, sdt, phuCap);
            }
        default -> {
            System.out.println("Bo phan khong hop le!");
            return;
            }
    }
    ds.add(nv);
    System.out.println("✔ Them nhan vien thanh cong!");
}

    
    //PT xoa nv cua 1 bbo phan trong ds nv
    public void xoaNV(){
        System.out.print("Nhap ID can xoa: ");
        int id = sc.nextInt();
        sc.nextLine(); // xoa Enter

        boolean removed = ds.removeIf(nv -> nv.getId() == id);

        if (removed) {
            System.out.println("Da xoa nhan vien co ID = " + id);
        } else {
            System.out.println("Khong tim thay nhan vien co ID = " + id);
        }
    }
    
    //PT hien thi ds nv
    public void hienThi(){
        this.ds.stream().forEach(System.out::println);
    }
    
    //Tra cuu nv theo so cccd, ho ten hoac que quan
    public void traCuuCanCuoc(){
            System.out.print("Moi nhap can cuoc cong dan: ");
        String canCuoc = sc.nextLine();

        List<NhanVien> kq = ds.stream()
            .filter(nv -> nv.getCccd().equals(canCuoc))
            .collect(Collectors.toList());

        if (kq.isEmpty()) {
            System.out.println("Khong tim thay nhan vien!");
        } else {
            kq.forEach(System.out::println);
        }
    }
//    public List<NhanVien> traCuuTen(String ten){
//        return this.ds
//                .stream()
//                .filter(nv->nv.getTen().equals(ten))
//                .collect(Collectors.toList());
//    }
//    public List<NhanVien> traCuuque(String que){
//        return this.ds
//                .stream()
//                .filter(nv->nv.getQue().equals(que))
//                .collect(Collectors.toList());
//    }
    
    //PT tinh tien luong cho nv
    public void tinhLuong(){
        this.ds.forEach(nv->{
            System.out.print("Nhap so ngay cong cho "+nv.getTen()+": ");
            int ngay = sc.nextInt();
            sc.nextLine();
            double luong = nv.tinhLuong(ngay);
            System.out.printf(
                    "ID: %d | Ho ten: %s | So ngay cong: %d | Tien luong: %,.0f VND%n", 
                    nv.getId(), nv.getTen(), ngay, luong
            );
        });
    }
    
    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }

}
