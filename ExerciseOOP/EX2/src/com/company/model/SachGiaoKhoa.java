package com.company.model;

public class SachGiaoKhoa extends Sach{
    protected String tinhTrang;
    protected int number;
    protected double thanhTien;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, String nhaXuatBan, double donGia, int soLuong, String tinhTrang, int number, double thanhTien) {
        super(maSach, nhaXuatBan, donGia, soLuong);
        this.tinhTrang = tinhTrang;
        this.number = number;
        this.thanhTien = thanhTien;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public int getNumber() {
        return number;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
        number = scanner.nextInt();
    }


    @Override
    public String toString() {
        return "SachGiaoKhoa{" + super.toString() +
                "tinhTrang='" + tinhTrang + '\'' +
                ", number=" + number +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
