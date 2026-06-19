/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiemTA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CauHoi {
    private String noiDung;
    private List<String> luaChon = new ArrayList<>();
    private Set<Character> dapAnDung = new HashSet<>();

    public CauHoi() {}

    /* Đọc câu hỏi từ file */
    public static CauHoi docTuFile(File f) throws IOException {
        CauHoi ch = new CauHoi();

        try (Scanner sc = new Scanner(f, "UTF-8")) {
            if (!sc.hasNextLine())
                throw new IOException("File khong hop le");

            ch.noiDung = sc.nextLine();

            List<String> tmp = new ArrayList<>();
            while (sc.hasNextLine())
                tmp.add(sc.nextLine());

            if (tmp.size() < 2)
                throw new IOException("Thieu lua chon hoac dap an");

            String dapAn = tmp.remove(tmp.size() - 1);
            ch.luaChon.addAll(tmp);

            for (String s : dapAn.split(","))
                ch.dapAnDung.add(s.trim().toUpperCase().charAt(0));
        }
        return ch;
    }

    /* Ghi câu hỏi ra file */
    public void ghiFile(File f) throws IOException {
        try (FileWriter w = new FileWriter(f)) {
            w.write(noiDung + "\n");
            for (String lc : luaChon)
                w.write(lc + "\n");

            int i = 0;
            for (char c : dapAnDung) {
                w.write(c);
                if (i < dapAnDung.size() - 1)
                    w.write(",");
                i++;
            }
        }
    }

    /* Hiển thị câu hỏi */
    public void hienThi() {
        System.out.println(noiDung);
        char kyTu = 'A';
        for (String lc : luaChon) {
            System.out.println(kyTu + ". " + lc);
            kyTu++;
        }
    }

    /* Kiểm tra đáp án */
    public boolean kiemTra(String traLoi) {
        Set<Character> traLoiSet = new HashSet<>();
        for (String s : traLoi.split(",")) {
            traLoiSet.add(s.trim().toUpperCase().charAt(0));
        }
        return traLoiSet.equals(dapAnDung);
    }

    /* ===== Getter / Setter (nếu cần) ===== */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setLuaChon(List<String> luaChon) {
        this.luaChon = luaChon;
    }

    public void setDapAnDung(Set<Character> dapAnDung) {
        this.dapAnDung = dapAnDung;
    }
}


