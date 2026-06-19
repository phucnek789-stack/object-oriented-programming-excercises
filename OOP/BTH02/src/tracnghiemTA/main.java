/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiemTA;

import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLiCauHoi ql;
        try {
            ql = new QuanLiCauHoi();
        } catch (IOException e) {
            System.out.println("Loi doc thu muc CauHoi!");
            return;
        }

        while (true) {
            System.out.println("\n===== TRAC NGHIEM TIENG ANH =====");
            System.out.println("1. Them cau hoi moi");
            System.out.println("2. Luyen thi trac nghiem");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> themCauHoi(sc, ql);
                case 2 -> luyenThi(sc, ql);
                case 0 -> {
                    System.out.println("Tam biet!");
                    return;
                }
                default -> System.out.println("Lua chon khong hop le!");
            }
        }
    }

    /* ================= THEM CAU HOI ================= */
    private static void themCauHoi(Scanner sc, QuanLiCauHoi ql) {
        try {
            CauHoi ch = new CauHoi();

            System.out.print("Nhap noi dung cau hoi: ");
            ch.setNoiDung(sc.nextLine());

            List<String> luaChon = new ArrayList<>();
            System.out.print("Nhap so luong lua chon: ");
            int n = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.print("Lua chon " + (char) ('A' + i) + ": ");
                luaChon.add(sc.nextLine());
            }
            ch.setLuaChon(luaChon);

            System.out.print("Nhap dap an dung (vd: A hoac A,C): ");
            String da = sc.nextLine();

            Set<Character> dapAn = new HashSet<>();
            for (String s : da.split(","))
                dapAn.add(s.trim().toUpperCase().charAt(0));
            ch.setDapAnDung(dapAn);

            ql.themCauHoi(ch);
            System.out.println("✔ Them cau hoi thanh cong!");

        } catch (Exception e) {
            System.out.println("✘ Loi: " + e.getMessage());
        }
    }

    /* ================= LUYEN THI ================= */
    private static void luyenThi(Scanner sc, QuanLiCauHoi ql) {
        System.out.print("Nhap so cau muon luyen: ");
        int soCau = Integer.parseInt(sc.nextLine());
        ql.luyenThi(soCau);
    }
}

