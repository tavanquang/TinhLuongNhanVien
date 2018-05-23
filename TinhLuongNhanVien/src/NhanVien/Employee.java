package NhanVien;

import java.util.Scanner;

public abstract class Employee {

	private String maNhanVien;
	private String tenNhanVien;
	
	public abstract double luong();
	
	public void NhapThongTin(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ma nhan vien: ");
		maNhanVien = sc.nextLine();
		
		System.out.println("Nhap ten nhan vien: ");
		tenNhanVien = sc.nextLine();
		
	}

	public String XuatThongTin(){
		
		return String.format("%-10s|%-10s|",maNhanVien,tenNhanVien);
		
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	
	public Employee(String maNhanVien, String tenNhanVien) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
