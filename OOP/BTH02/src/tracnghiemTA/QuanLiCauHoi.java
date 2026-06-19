/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiemTA;

import java.io.File;
import java.io.IOException;
import java.util.*;

import java.util.List;

public class QuanLiCauHoi {
    private List<CauHoi> ds = new ArrayList<>();
    private static final String THU_MUC = "CauHoi";

    /* Constructor: đọc toàn bộ câu hỏi từ thư mục */
    public QuanLiCauHoi() throws IOException {
        File dir = new File(THU_MUC);
        if (!dir.exists())
            dir.mkdir();

        File[] files = dir.listFiles((d, name) -> name.endsWith(".txt"));
        if (files != null) {
            for (File f : files)
                ds.add(CauHoi.docTuFile(f));
        }
    }

    /* Thêm câu hỏi mới và ghi ra file */
    public void themCauHoi(CauHoi ch) throws IOException {
        String tenFile = UUID.randomUUID().toString() + ".txt";
        File f = new File(THU_MUC + "/" + tenFile);
        ch.ghiFile(f);
        ds.add(ch);
    }

    /* Luyện thi trắc nghiệm */
    public void luyenThi(int soCau) {
        if (ds.isEmpty()) {
            System.out.println("Khong co cau hoi nao!");
            return;
        }

        if (soCau <= 0) {
            System.out.println("So cau phai lon hon 0");
            return;
        }

        Collections.shuffle(ds);
        Scanner sc = new Scanner(System.in);

        int dem = 0;
        for (int i = 0; i < soCau && i < ds.size(); i++) {
            CauHoi ch = ds.get(i);
            ch.hienThi();

            System.out.print("Nhap dap an (vd: A,C): ");
            String traLoi = sc.nextLine().trim().toUpperCase();

            if (ch.kiemTra(traLoi)) {
                System.out.println("✔ Dung!\n");
                dem++;
            } else {
                System.out.println("✘ Sai!");
                System.out.printf("Ban tra loi dung %d cau.\n", dem);
                return;
            }
        }

        System.out.printf("🎉 Hoan thanh bai luyen tap! Dung %d/%d cau.\n",
                dem, Math.min(soCau, ds.size()));
    }

    /* Getter */
    public List<CauHoi> getDs() {
        return ds;
    }
}

