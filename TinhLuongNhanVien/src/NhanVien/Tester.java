package NhanVien;

import java.util.Scanner;

public class Tester extends Employee{

	private int soGioOT;
	private double luongCoBan;
	public int getSoGioOT() {
		return soGioOT;
	}

	public void setSoGioOT(int soGioOT) {
		this.soGioOT = soGioOT;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	@Override
	public double luong() {

		return luongCoBan + (soGioOT * 200000);
	}

	public void NhapThongTin() {
		super.NhapThongTin();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so Gio OT: ");
		soGioOT = sc.nextInt();
		
		System.out.println("Nhap luong hang thang: ");
		luongCoBan = sc.nextDouble();

	}
	
	public String XuatThongTin(){
		return super.XuatThongTin() + String.format("%-10s",luong());
	}

}
