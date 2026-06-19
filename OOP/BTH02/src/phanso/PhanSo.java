/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanso;

/**
 *
 * @author Phupham
 */
public class PhanSo {
    private static int dem;
    private int tuSo;
    private int mauSo;
    
    {
        dem++;
    }

    public PhanSo() {
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static int ucln(PhanSo p) {
        int a = p.tuSo;
        int b = p.mauSo;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public PhanSo rutGon() {
        return new PhanSo(this.tuSo / ucln(this), this.mauSo / ucln(this));
    }

    public PhanSo cong(PhanSo p) {
        return new PhanSo(this.tuSo * p.mauSo + this.mauSo * p.tuSo,
                this.mauSo * p.mauSo);
    }
    
    public PhanSo tru(PhanSo p) {
        return new PhanSo(this.tuSo * p.mauSo - this.mauSo * p.tuSo,
                this.mauSo * p.mauSo);
    }
    
    public PhanSo nhan(PhanSo p) {
        return new PhanSo(this.tuSo * p.tuSo,
                this.mauSo * p.mauSo);
    }

    public PhanSo chia(PhanSo p) {
        return new PhanSo(this.tuSo * p.mauSo,
                this.mauSo * p.tuSo);
    }
    
    public int soSanh(PhanSo p){
        if(this.tuSo*p.mauSo>this.mauSo*p.tuSo)
            return 1;
        else if(this.tuSo*p.mauSo<this.mauSo*p.tuSo)
            return -1;
        else
            return 0;
    }
    
    public void soSanhPS(PhanSo p){
        switch (this.soSanh(p)) {
            case 1 -> System.out.println("Lon hon!");
            case -1 -> System.out.println("Nho hon!");
            default -> System.out.println("Bang nhau!");
        }
    }
    
    public void hienThi() {
        System.out.println("Phan so: " + this.tuSo + "/" + this.mauSo+"\t");
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

}

