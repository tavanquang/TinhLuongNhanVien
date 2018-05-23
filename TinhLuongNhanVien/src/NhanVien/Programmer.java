package NhanVien;

import java.util.Scanner;

public class Programmer extends Employee {

	private int soLoi;

	public void NhapThongTin() {
		super.NhapThongTin();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so loi: ");
		soLoi = sc.nextInt();
		
	}
	
	@Override
	public double luong() {

		if (soLoi < 20) {
			return super.getLuongCoBan() + (super.getLuongCoBan() * 0.1);
		}

		return super.getLuongCoBan();
	}

	public int getSoLoi() {
		return soLoi;
	}

	public void setSoLoi(int soLoi) {
		this.soLoi = soLoi;
	}
	
	public String XuatThongTin(){
		return super.XuatThongTin();
	}

}
