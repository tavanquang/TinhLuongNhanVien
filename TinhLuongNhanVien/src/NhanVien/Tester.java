package NhanVien;

import java.util.Scanner;

public class Tester extends Employee{

	private int soGioOT;

	@Override
	public double luong() {

		return super.getLuongCoBan() + (soGioOT * 200000);
	}

	public void NhapThongTin() {
		super.NhapThongTin();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so Gio OT: ");
		soGioOT = sc.nextInt();
	}
	
	public String XuatThongTin(){
		return super.XuatThongTin();
	}
	

	public int getSoGioOT() {
		return soGioOT;
	}

	public void setSoGioOT(int soGioOT) {
		this.soGioOT = soGioOT;
	}


}
