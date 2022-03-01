package com.company.model;

import java.util.Scanner;

public class Sach {
    protected String maSach, nhaXuatBan;
    protected double donGia;
    protected int soLuong;
    Scanner scanner = new Scanner(System.in);

    public Sach() {
    }

    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void nhapSach() {
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", scanner=" + scanner +
                '}';
    }
}
