package NhanVien;

import java.util.Scanner;

public class Programmer extends Employee {

	private int soLoi;
	private double luongCoBan;
	
	public int getSoLoi() {
		return soLoi;
	}

	public void setSoLoi(int soLoi) {
		this.soLoi = soLoi;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public void NhapThongTin() {
		super.NhapThongTin();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so loi: ");
		soLoi = sc.nextInt();
		
		System.out.println("Nhap luong hang thang: ");
		luongCoBan = sc.nextDouble();

	}
	
	@Override
	public double luong() {

		if (soLoi < 20) {
			return luongCoBan + (luongCoBan * 0.1);
		}

		return luongCoBan;
	}

	
	
	public String XuatThongTin(){
		return super.XuatThongTin() + String.format("%-10s",luong());
	}

}
