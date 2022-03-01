package com.company.model;

public class SachThamKhao extends Sach {
    protected double thue;
    protected double thanhTien;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, String nhaXuatBan, double donGia, int soLuong, double thue) {
        super(maSach, nhaXuatBan, donGia, soLuong);
        this.thue = thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getThue() {
        return thue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhập thuế: ");
        thue = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "SachThamKhao{" + super.toString() +
                "thue=" + thue +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
