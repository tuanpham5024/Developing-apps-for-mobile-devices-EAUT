package com.company;

import com.company.model.SachGiaoKhoa;
import com.company.model.SachThamKhao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> arrSachThamKhao = new ArrayList<>();
        int soSachGiaoKhoa, soSachThamKhao;
        double tongTienSachGiaoKhoa = 0, tongTienSachThamKhao = 0, tongDonGiaSachThamKhao = 0,
                trungBinhCongDonGia = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số sách giáo khoa: ");
        soSachGiaoKhoa = scanner.nextInt();
        System.out.print("Nhập số sách tham khảo: ");
        soSachThamKhao = scanner.nextInt();

        System.out.println("Nhập thông tin sách giáo khoa:");
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            arrSachGiaoKhoa.add(sachGiaoKhoa);
        }

        System.out.println("Nhập thông tin sách tham khảo:");
        for (int i = 0; i < soSachThamKhao; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapSach();
            arrSachThamKhao.add(sachThamKhao);
        }

        for (SachGiaoKhoa giaoKhoa : arrSachGiaoKhoa) {
            if (giaoKhoa.getNumber() == 0) {
                tongTienSachGiaoKhoa += giaoKhoa.getSoLuong() *
                        giaoKhoa.getDonGia() * 50 / 100;
            } else if (giaoKhoa.getNumber() == 1) {
                tongTienSachGiaoKhoa += giaoKhoa.getSoLuong() *
                        giaoKhoa.getDonGia();
            }
        }
        System.out.println("Tổng tiền sách giáo khoa = " + tongTienSachGiaoKhoa);

        for (SachThamKhao thamKhao : arrSachThamKhao) {
            tongTienSachThamKhao += thamKhao.getSoLuong() *
                    thamKhao.getDonGia() + thamKhao.getThue();
        }
        System.out.println("Tổng tiền sách tham khảo = " + tongTienSachThamKhao);

        System.out.println("-----Thông tin sách giáo khoa-----");
        for (SachGiaoKhoa sachGiaoKhoa : arrSachGiaoKhoa) {
            System.out.println(sachGiaoKhoa.toString());
        }

        System.out.println("-----Thông tin sách tham khảo-----");
        for (SachThamKhao sachThamKhao : arrSachThamKhao) {
            System.out.println(sachThamKhao.toString());
        }

        System.out.println("---Trung bình cộng đơn giá các sách tham khảo---");
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            tongDonGiaSachThamKhao += arrSachThamKhao.get(i).getDonGia();
            trungBinhCongDonGia = tongDonGiaSachThamKhao / arrSachThamKhao.size();
        }
        System.out.println("Trung bình cộng đơn giá các sách tham khảo = " + trungBinhCongDonGia);

        System.out.println("---Các sách giáo khoa của nhà xuất bản X---");
        for (SachGiaoKhoa sachGiaoKhoa : arrSachGiaoKhoa) {
            if (sachGiaoKhoa.getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(sachGiaoKhoa.toString());
            }
        }
    }
}
